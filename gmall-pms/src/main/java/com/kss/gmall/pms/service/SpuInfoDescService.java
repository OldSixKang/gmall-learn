package com.kss.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.pms.entity.SpuInfoDesc;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * spu信息介绍
 *
 * @author kss
 * @since  2020-03-28 17:00:25
 */
public interface SpuInfoDescService extends IService<SpuInfoDesc> {

    PageVo queryPage(QueryCondition params);
}

