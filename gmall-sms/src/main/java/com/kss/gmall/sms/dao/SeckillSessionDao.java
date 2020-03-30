package com.kss.gmall.sms.dao;

import com.kss.gmall.sms.entity.SeckillSession;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * @author kss
 * @since  2020-03-29 16:53:13
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSession> {
	
}
