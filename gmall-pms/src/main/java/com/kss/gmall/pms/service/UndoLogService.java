package com.kss.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.pms.entity.UndoLog;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 
 *
 * @author kss
 * @since  2020-03-28 17:00:25
 */
public interface UndoLogService extends IService<UndoLog> {

    PageVo queryPage(QueryCondition params);
}

