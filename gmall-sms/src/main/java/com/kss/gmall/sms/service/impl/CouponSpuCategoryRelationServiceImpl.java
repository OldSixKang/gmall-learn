package com.kss.gmall.sms.service.impl;

import com.kss.gmall.sms.dao.CouponSpuCategoryRelationDao;
import com.kss.gmall.sms.entity.CouponSpuCategoryRelation;
import com.kss.gmall.sms.service.CouponSpuCategoryRelationService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

@Service("couponSpuCategoryRelationService")
public class CouponSpuCategoryRelationServiceImpl extends ServiceImpl<CouponSpuCategoryRelationDao, CouponSpuCategoryRelation> implements CouponSpuCategoryRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CouponSpuCategoryRelation> page = this.page(
                new Query<CouponSpuCategoryRelation>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}