package com.kss.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.pms.entity.SkuInfo;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * sku信息
 *
 * @author kss
 * @since  2020-03-28 17:00:25
 */
public interface SkuInfoService extends IService<SkuInfo> {

    PageVo queryPage(QueryCondition params);
}

