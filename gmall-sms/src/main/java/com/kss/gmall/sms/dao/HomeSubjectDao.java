package com.kss.gmall.sms.dao;

import com.kss.gmall.sms.entity.HomeSubject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * @author kss
 * @since  2020-03-29 16:53:13
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubject> {
	
}
