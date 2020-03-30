package com.kss.gmall.oms.dao;

import com.kss.gmall.oms.entity.OrderItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * @author kss
 * @since  2020-03-29 17:24:55
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItem> {
	
}
