package com.kss.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.sms.entity.SkuFullReduction;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 商品满减信息
 *
 * @author kss
 * @since  2020-03-29 16:53:13
 */
public interface SkuFullReductionService extends IService<SkuFullReduction> {

    PageVo queryPage(QueryCondition params);
}

