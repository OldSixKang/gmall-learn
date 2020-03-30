package com.kss.gmall.pms.dao;

import com.kss.gmall.pms.entity.CommentReplay;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * @author kss
 * @since  2020-03-28 17:00:25
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplay> {
	
}
