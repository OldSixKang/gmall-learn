package com.kss.gmall.sms.dao;

import com.kss.gmall.sms.entity.Coupon;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * @author kss
 * @since  2020-03-29 16:53:13
 */
@Mapper
public interface CouponDao extends BaseMapper<Coupon> {
	
}
