package com.kss.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.wms.entity.WareInfo;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 仓库信息
 *
 * @author kss
 * @since  2020-03-29 17:19:20
 */
public interface WareInfoService extends IService<WareInfo> {

    PageVo queryPage(QueryCondition params);
}

