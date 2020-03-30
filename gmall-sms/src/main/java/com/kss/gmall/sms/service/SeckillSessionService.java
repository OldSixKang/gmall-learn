package com.kss.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.sms.entity.SeckillSession;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 秒杀活动场次
 *
 * @author kss
 * @since  2020-03-29 16:53:13
 */
public interface SeckillSessionService extends IService<SeckillSession> {

    PageVo queryPage(QueryCondition params);
}

