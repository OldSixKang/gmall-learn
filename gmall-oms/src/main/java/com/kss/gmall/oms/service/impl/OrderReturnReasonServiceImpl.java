package com.kss.gmall.oms.service.impl;

import com.kss.gmall.oms.dao.OrderReturnReasonDao;
import com.kss.gmall.oms.entity.OrderReturnReason;
import com.kss.gmall.oms.service.OrderReturnReasonService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

@Service("orderReturnReasonService")
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonDao, OrderReturnReason> implements OrderReturnReasonService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OrderReturnReason> page = this.page(
                new Query<OrderReturnReason>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}