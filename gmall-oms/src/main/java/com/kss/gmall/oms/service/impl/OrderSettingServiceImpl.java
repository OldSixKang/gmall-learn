package com.kss.gmall.oms.service.impl;

import com.kss.gmall.oms.dao.OrderSettingDao;
import com.kss.gmall.oms.entity.OrderSetting;
import com.kss.gmall.oms.service.OrderSettingService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

@Service("orderSettingService")
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingDao, OrderSetting> implements OrderSettingService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<OrderSetting> page = this.page(
                new Query<OrderSetting>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}