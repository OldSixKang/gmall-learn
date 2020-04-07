package com.kss.gmall.pms.service.impl;

import com.kss.gmall.pms.dao.AttrAttrgroupRelationDao;
import com.kss.gmall.pms.entity.AttrAttrgroupRelation;
import com.kss.gmall.pms.service.AttrAttrgroupRelationService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

import java.util.List;

@Service("attrAttrgroupRelationService")
public class AttrAttrgroupRelationServiceImpl extends ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelation> implements AttrAttrgroupRelationService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AttrAttrgroupRelation> page = this.page(
                new Query<AttrAttrgroupRelation>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

    @Override
    public void deleteRelation(List<AttrAttrgroupRelation> relationList) {
        relationList.forEach(e -> {
            this.remove(new QueryWrapper<AttrAttrgroupRelation>()
                    .eq("attr_id", e.getAttrId())
                    .eq("attr_group_id", e.getAttrGroupId()));
        });
    }

}