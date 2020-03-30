package com.kss.gmall.ums.service.impl;

import com.kss.gmall.ums.dao.GrowthChangeHistoryDao;
import com.kss.gmall.ums.service.GrowthChangeHistoryService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

import com.kss.gmall.ums.entity.GrowthChangeHistory;

@Service("growthChangeHistoryService")
public class GrowthChangeHistoryServiceImpl extends ServiceImpl<GrowthChangeHistoryDao, GrowthChangeHistory> implements GrowthChangeHistoryService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<GrowthChangeHistory> page = this.page(
                new Query<GrowthChangeHistory>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}