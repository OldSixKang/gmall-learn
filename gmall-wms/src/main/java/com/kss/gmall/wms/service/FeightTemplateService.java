package com.kss.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.wms.entity.FeightTemplate;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 运费模板
 *
 * @author kss
 * @since  2020-03-29 17:19:20
 */
public interface FeightTemplateService extends IService<FeightTemplate> {

    PageVo queryPage(QueryCondition params);
}

