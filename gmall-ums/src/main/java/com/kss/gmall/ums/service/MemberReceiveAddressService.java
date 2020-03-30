package com.kss.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.ums.entity.MemberReceiveAddress;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 会员收货地址
 *
 * @author kss
 * @since  2020-03-29 17:13:18
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddress> {

    PageVo queryPage(QueryCondition params);
}

