package com.kss.gmall.oms.service.impl;

import com.kss.gmall.oms.dao.OrderReturnApplyDao;
import com.kss.gmall.oms.entity.OrderReturnApply;
import com.kss.gmall.oms.service.OrderReturnApplyService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

@Service("orderReturnApplyService")
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyDao, OrderReturnApply> implements OrderReturnApplyService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OrderReturnApply> page = this.page(
                new Query<OrderReturnApply>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}