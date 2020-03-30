package com.kss.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.pms.entity.ProductAttrValue;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * spu属性值
 *
 * @author kss
 * @since  2020-03-28 17:00:25
 */
public interface ProductAttrValueService extends IService<ProductAttrValue> {

    PageVo queryPage(QueryCondition params);
}

