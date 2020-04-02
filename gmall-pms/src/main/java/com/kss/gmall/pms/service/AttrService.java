package com.kss.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.pms.entity.Attr;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 商品属性
 *
 * @author kss
 * @since  2020-03-28 17:00:25
 */
public interface AttrService extends IService<Attr> {

    PageVo queryPage(QueryCondition params);

    PageVo queryAttrByCid(QueryCondition queryCondition, Long cid, Long type);
}

