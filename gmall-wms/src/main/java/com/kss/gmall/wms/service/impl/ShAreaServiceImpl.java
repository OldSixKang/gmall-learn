package com.kss.gmall.wms.service.impl;

import com.kss.gmall.wms.dao.ShAreaDao;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

import com.kss.gmall.wms.entity.ShArea;
import com.kss.gmall.wms.service.ShAreaService;

@Service("shAreaService")
public class ShAreaServiceImpl extends ServiceImpl<ShAreaDao, ShArea> implements ShAreaService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<ShArea> page = this.page(
                new Query<ShArea>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}