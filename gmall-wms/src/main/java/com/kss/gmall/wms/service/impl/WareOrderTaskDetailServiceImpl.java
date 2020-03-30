package com.kss.gmall.wms.service.impl;

import com.kss.gmall.wms.dao.WareOrderTaskDetailDao;
import com.kss.gmall.wms.service.WareOrderTaskDetailService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

import com.kss.gmall.wms.entity.WareOrderTaskDetail;

@Service("wareOrderTaskDetailService")
public class WareOrderTaskDetailServiceImpl extends ServiceImpl<WareOrderTaskDetailDao, WareOrderTaskDetail> implements WareOrderTaskDetailService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<WareOrderTaskDetail> page = this.page(
                new Query<WareOrderTaskDetail>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}