package com.kss.gmall.pms.service.impl;

import com.kss.gmall.pms.dao.AttrAttrgroupRelationDao;
import com.kss.gmall.pms.entity.AttrAttrgroupRelation;
import com.kss.gmall.pms.entity.AttrGroup;
import com.kss.gmall.pms.vo.AttrVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

import com.kss.gmall.pms.dao.AttrDao;
import com.kss.gmall.pms.entity.Attr;
import com.kss.gmall.pms.service.AttrService;

@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, Attr> implements AttrService {

    @Autowired
    private AttrAttrgroupRelationDao relationDao;

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<Attr> page = this.page(
                new Query<Attr>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

    @Override
    public PageVo queryAttrByCid(QueryCondition queryCondition, Long cid, Long type) {
        QueryWrapper<Attr> wrapper = new QueryWrapper<>();

        if (cid != null) {
            wrapper.eq("catelog_id", cid);
        }

        wrapper.eq("attr_type", type);

        IPage<Attr> page = this.page(
                new Query<Attr>().getPage(queryCondition),
                wrapper
        );

        return new PageVo(page);
    }

    @Override
    public void saveAttr(AttrVO attr) {
        // 1、新增attr
        this.save(attr);
        // 获取主键
        Long attrId = attr.getAttrId();

        // 2、新增中间表
        AttrAttrgroupRelation relation = new AttrAttrgroupRelation();
        relation.setAttrGroupId(attr.getAttrGroupId());
        relation.setAttrId(attrId);
        this.relationDao.insert(relation);
    }

}