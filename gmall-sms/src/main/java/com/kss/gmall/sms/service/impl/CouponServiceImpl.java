package com.kss.gmall.sms.service.impl;

import com.kss.gmall.sms.dao.CouponDao;
import com.kss.gmall.sms.entity.Coupon;
import com.kss.gmall.sms.service.CouponService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

@Service("couponService")
public class CouponServiceImpl extends ServiceImpl<CouponDao, Coupon> implements CouponService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<Coupon> page = this.page(
                new Query<Coupon>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}