package com.kss.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.sms.entity.CouponSpuRelation;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 优惠券与产品关联
 *
 * @author kss
 * @since  2020-03-29 16:53:13
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelation> {

    PageVo queryPage(QueryCondition params);
}

