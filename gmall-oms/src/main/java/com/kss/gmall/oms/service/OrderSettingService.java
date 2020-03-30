package com.kss.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.oms.entity.OrderSetting;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 订单配置信息
 *
 * @author kss
 * @since  2020-03-29 17:24:55
 */
public interface OrderSettingService extends IService<OrderSetting> {

    PageVo queryPage(QueryCondition params);
}

