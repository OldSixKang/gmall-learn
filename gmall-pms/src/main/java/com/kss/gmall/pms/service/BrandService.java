package com.kss.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.pms.entity.Brand;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 品牌
 *
 * @author kss
 * @since  2020-03-28 17:00:25
 */
public interface BrandService extends IService<Brand> {

    PageVo queryPage(QueryCondition params);
}

