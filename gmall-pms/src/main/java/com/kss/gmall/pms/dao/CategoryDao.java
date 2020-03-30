package com.kss.gmall.pms.dao;

import com.kss.gmall.pms.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * @author kss
 * @since  2020-03-28 17:00:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<Category> {
	
}
