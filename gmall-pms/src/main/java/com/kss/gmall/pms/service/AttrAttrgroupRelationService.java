package com.kss.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.pms.entity.AttrAttrgroupRelation;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 属性&属性分组关联
 *
 * @author kss
 * @since  2020-03-28 17:00:25
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelation> {

    PageVo queryPage(QueryCondition params);
}

