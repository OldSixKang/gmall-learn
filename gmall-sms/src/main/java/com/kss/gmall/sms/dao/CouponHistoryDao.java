package com.kss.gmall.sms.dao;

import com.kss.gmall.sms.entity.CouponHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * @author kss
 * @since  2020-03-29 16:53:13
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistory> {
	
}
