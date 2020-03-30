package com.kss.gmall.oms.service.impl;

import com.kss.gmall.oms.dao.OrderOperateHistoryDao;
import com.kss.gmall.oms.entity.OrderOperateHistory;
import com.kss.gmall.oms.service.OrderOperateHistoryService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

@Service("orderOperateHistoryService")
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryDao, OrderOperateHistory> implements OrderOperateHistoryService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OrderOperateHistory> page = this.page(
                new Query<OrderOperateHistory>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}