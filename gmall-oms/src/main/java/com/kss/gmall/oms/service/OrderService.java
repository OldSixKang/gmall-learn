package com.kss.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.oms.entity.Order;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 订单
 *
 * @author kss
 * @since  2020-03-29 17:24:55
 */
public interface OrderService extends IService<Order> {

    PageVo queryPage(QueryCondition params);
}

