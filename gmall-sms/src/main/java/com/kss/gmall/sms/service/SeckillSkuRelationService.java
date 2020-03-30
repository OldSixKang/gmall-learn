package com.kss.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.sms.entity.SeckillSkuRelation;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 秒杀活动商品关联
 *
 * @author kss
 * @since  2020-03-29 16:53:13
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelation> {

    PageVo queryPage(QueryCondition params);
}

