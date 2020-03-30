package com.kss.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.pms.entity.SkuSaleAttrValue;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * sku销售属性&值
 *
 * @author kss
 * @since  2020-03-28 17:00:25
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValue> {

    PageVo queryPage(QueryCondition params);
}

