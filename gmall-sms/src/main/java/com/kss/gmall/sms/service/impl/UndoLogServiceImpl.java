package com.kss.gmall.sms.service.impl;

import com.kss.gmall.sms.dao.UndoLogDao;
import com.kss.gmall.sms.entity.UndoLog;
import com.kss.gmall.sms.service.UndoLogService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

@Service("undoLogService")
public class UndoLogServiceImpl extends ServiceImpl<UndoLogDao, UndoLog> implements UndoLogService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<UndoLog> page = this.page(
                new Query<UndoLog>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}