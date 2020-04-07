package com.kss.gmall.sms.service.impl;

import com.kss.gmall.sms.dao.SkuBoundsDao;
import com.kss.gmall.sms.dao.SkuFullReductionDao;
import com.kss.gmall.sms.dao.SkuLadderDao;
import com.kss.gmall.sms.entity.SkuBounds;
import com.kss.gmall.sms.entity.SkuFullReduction;
import com.kss.gmall.sms.entity.SkuLadder;
import com.kss.gmall.sms.service.SkuBoundsService;
import com.kss.gmall.sms.vo.SkuSaleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service("skuBoundsService")
public class SkuBoundsServiceImpl extends ServiceImpl<SkuBoundsDao, SkuBounds> implements SkuBoundsService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SkuBounds> page = this.page(
                new Query<SkuBounds>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

    @Autowired
    private SkuLadderDao skuLadderDao;
    @Autowired
    private SkuFullReductionDao reductionDao;

    @Override
    public void saveSale(SkuSaleVO skuSaleVO) {
        // 3、保存营销信息相关的3张表
        // 3.1 保存sms_sku_bounds
        SkuBounds skuBounds = new SkuBounds();
        skuBounds.setSkuId(skuSaleVO.getSkuId());
        skuBounds.setGrowBounds(skuSaleVO.getGrowBounds());
        skuBounds.setBuyBounds(skuSaleVO.getBuyBounds());
        List<Integer> work = skuSaleVO.getWork();
        skuBounds.setWork(binary2Ten(work));
        this.save(skuBounds);

        // 3.2 保存sms_sku_ladder
        SkuLadder skuLadder = new SkuLadder();
        skuLadder.setSkuId(skuSaleVO.getSkuId());
        skuLadder.setFullCount(skuSaleVO.getFullCount());
        skuLadder.setDiscount(skuSaleVO.getDiscount());
        skuLadder.setAddOther(skuSaleVO.getLadderAddOther());
        this.skuLadderDao.insert(skuLadder);

        // 3.3 保存sms_sku_full_reduction
        SkuFullReduction skuFullReduction = new SkuFullReduction();
        skuFullReduction.setSkuId(skuSaleVO.getSkuId());
        skuFullReduction.setFullPrice(skuSaleVO.getFullPrice());
        skuFullReduction.setReducePrice(skuSaleVO.getReducePrice());
        skuFullReduction.setAddOther(skuSaleVO.getFullAddOther());
        this.reductionDao.insert(skuFullReduction);
    }

    /** 二进制转十进制 */
    private static Integer binary2Ten(List<Integer> work) {
        if (CollectionUtils.isEmpty(work)) {
            return 0;
        }

        double total = 0D;

        int size = work.size();
        for (int i = size - 1; i >= 0; i--) {
            total += work.get(i) * Math.pow(2, size - i - 1);
        }
        return (int) total;
    }

}