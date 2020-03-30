package com.kss.gmall.sms.service.impl;

import com.kss.gmall.sms.dao.SkuBoundsDao;
import com.kss.gmall.sms.entity.SkuBounds;
import com.kss.gmall.sms.service.SkuBoundsService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

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

}