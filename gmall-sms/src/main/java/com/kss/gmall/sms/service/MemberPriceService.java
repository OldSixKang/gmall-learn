package com.kss.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.sms.entity.MemberPrice;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 商品会员价格
 *
 * @author kss
 * @since  2020-03-29 16:53:13
 */
public interface MemberPriceService extends IService<MemberPrice> {

    PageVo queryPage(QueryCondition params);
}

