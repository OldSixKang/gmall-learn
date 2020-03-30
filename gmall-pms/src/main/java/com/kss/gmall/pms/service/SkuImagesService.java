package com.kss.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.pms.entity.SkuImages;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * sku图片
 *
 * @author kss
 * @since  2020-03-28 17:00:25
 */
public interface SkuImagesService extends IService<SkuImages> {

    PageVo queryPage(QueryCondition params);
}

