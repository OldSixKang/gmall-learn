package com.kss.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.sms.entity.HomeSubjectSpu;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 专题商品
 *
 * @author kss
 * @since  2020-03-29 16:53:13
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpu> {

    PageVo queryPage(QueryCondition params);
}

