package com.kss.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.pms.entity.SpuImages;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * spu图片
 *
 * @author kss
 * @since  2020-03-28 17:00:25
 */
public interface SpuImagesService extends IService<SpuImages> {

    PageVo queryPage(QueryCondition params);
}

