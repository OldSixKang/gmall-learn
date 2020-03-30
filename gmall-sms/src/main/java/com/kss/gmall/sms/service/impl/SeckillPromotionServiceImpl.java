package com.kss.gmall.sms.service.impl;

import com.kss.gmall.sms.dao.SeckillPromotionDao;
import com.kss.gmall.sms.entity.SeckillPromotion;
import com.kss.gmall.sms.service.SeckillPromotionService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

@Service("seckillPromotionService")
public class SeckillPromotionServiceImpl extends ServiceImpl<SeckillPromotionDao, SeckillPromotion> implements SeckillPromotionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SeckillPromotion> page = this.page(
                new Query<SeckillPromotion>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}