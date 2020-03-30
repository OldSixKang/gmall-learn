package com.kss.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.sms.entity.UndoLog;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 
 *
 * @author kss
 * @since  2020-03-29 16:53:13
 */
public interface UndoLogService extends IService<UndoLog> {

    PageVo queryPage(QueryCondition params);
}

