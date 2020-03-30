package com.kss.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.wms.entity.ShArea;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 全国省市区信息
 *
 * @author kss
 * @since  2020-03-29 17:19:20
 */
public interface ShAreaService extends IService<ShArea> {

    PageVo queryPage(QueryCondition params);
}

