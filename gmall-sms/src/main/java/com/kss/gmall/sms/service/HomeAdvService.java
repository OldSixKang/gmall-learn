package com.kss.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.sms.entity.HomeAdv;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 首页轮播广告
 *
 * @author kss
 * @since  2020-03-29 16:53:13
 */
public interface HomeAdvService extends IService<HomeAdv> {

    PageVo queryPage(QueryCondition params);
}

