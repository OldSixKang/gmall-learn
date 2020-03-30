package com.kss.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.oms.entity.OrderReturnApply;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 订单退货申请
 *
 * @author kss
 * @since  2020-03-29 17:24:55
 */
public interface OrderReturnApplyService extends IService<OrderReturnApply> {

    PageVo queryPage(QueryCondition params);
}

