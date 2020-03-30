package com.kss.gmall.sms.dao;

import com.kss.gmall.sms.entity.MemberPrice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * @author kss
 * @since  2020-03-29 16:53:13
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPrice> {
	
}
