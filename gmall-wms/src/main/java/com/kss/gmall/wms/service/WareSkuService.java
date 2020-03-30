package com.kss.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.wms.entity.WareSku;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 商品库存
 *
 * @author kss
 * @since  2020-03-29 17:19:20
 */
public interface WareSkuService extends IService<WareSku> {

    PageVo queryPage(QueryCondition params);
}

