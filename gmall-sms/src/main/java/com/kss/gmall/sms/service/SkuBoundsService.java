package com.kss.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.sms.entity.SkuBounds;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 商品sku积分设置
 *
 * @author kss
 * @since  2020-03-29 16:53:13
 */
public interface SkuBoundsService extends IService<SkuBounds> {

    PageVo queryPage(QueryCondition params);
}

