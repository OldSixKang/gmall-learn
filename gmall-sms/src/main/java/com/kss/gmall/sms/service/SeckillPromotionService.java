package com.kss.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.sms.entity.SeckillPromotion;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 秒杀活动
 *
 * @author kss
 * @since  2020-03-29 16:53:13
 */
public interface SeckillPromotionService extends IService<SeckillPromotion> {

    PageVo queryPage(QueryCondition params);
}

