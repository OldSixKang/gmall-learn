package com.kss.gmall.ums.dao;

import com.kss.gmall.ums.entity.Member;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * @author kss
 * @since  2020-03-29 17:13:18
 */
@Mapper
public interface MemberDao extends BaseMapper<Member> {
	
}
