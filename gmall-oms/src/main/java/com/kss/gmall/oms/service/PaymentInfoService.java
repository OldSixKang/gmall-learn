package com.kss.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.oms.entity.PaymentInfo;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 支付信息表
 *
 * @author kss
 * @since  2020-03-29 17:24:55
 */
public interface PaymentInfoService extends IService<PaymentInfo> {

    PageVo queryPage(QueryCondition params);
}

