package com.kss.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.pms.entity.Category;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 商品三级分类
 *
 * @author kss
 * @since  2020-03-28 17:00:25
 */
public interface CategoryService extends IService<Category> {

    PageVo queryPage(QueryCondition params);
}

