package com.kss.gmall.wms.service.impl;

import com.kss.gmall.wms.dao.FeightTemplateDao;
import com.kss.gmall.wms.service.FeightTemplateService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

import com.kss.gmall.wms.entity.FeightTemplate;

@Service("feightTemplateService")
public class FeightTemplateServiceImpl extends ServiceImpl<FeightTemplateDao, FeightTemplate> implements FeightTemplateService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<FeightTemplate> page = this.page(
                new Query<FeightTemplate>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}