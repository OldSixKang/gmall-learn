package com.kss.gmall.oms.dao;

import com.kss.gmall.oms.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * @author kss
 * @since  2020-03-29 17:24:55
 */
@Mapper
public interface OrderDao extends BaseMapper<Order> {
	
}
