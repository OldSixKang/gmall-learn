package com.kss.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.wms.entity.WareOrderTask;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 库存工作单
 *
 * @author kss
 * @since  2020-03-29 17:19:20
 */
public interface WareOrderTaskService extends IService<WareOrderTask> {

    PageVo queryPage(QueryCondition params);
}

