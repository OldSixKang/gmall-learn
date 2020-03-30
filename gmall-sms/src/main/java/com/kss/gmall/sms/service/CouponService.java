package com.kss.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.sms.entity.Coupon;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 优惠券信息
 *
 * @author kss
 * @since  2020-03-29 16:53:13
 */
public interface CouponService extends IService<Coupon> {

    PageVo queryPage(QueryCondition params);
}

