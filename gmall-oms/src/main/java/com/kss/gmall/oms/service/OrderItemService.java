package com.kss.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.oms.entity.OrderItem;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 订单项信息
 *
 * @author kss
 * @since  2020-03-29 17:24:55
 */
public interface OrderItemService extends IService<OrderItem> {

    PageVo queryPage(QueryCondition params);
}

