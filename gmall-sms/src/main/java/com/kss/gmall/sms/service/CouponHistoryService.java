package com.kss.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.sms.entity.CouponHistory;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 优惠券领取历史记录
 *
 * @author kss
 * @since  2020-03-29 16:53:13
 */
public interface CouponHistoryService extends IService<CouponHistory> {

    PageVo queryPage(QueryCondition params);
}

