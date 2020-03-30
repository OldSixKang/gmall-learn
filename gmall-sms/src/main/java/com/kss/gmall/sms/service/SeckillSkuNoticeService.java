package com.kss.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.sms.entity.SeckillSkuNotice;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 秒杀商品通知订阅
 *
 * @author kss
 * @since  2020-03-29 16:53:13
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNotice> {

    PageVo queryPage(QueryCondition params);
}

