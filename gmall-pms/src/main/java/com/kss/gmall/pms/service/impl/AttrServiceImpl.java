package com.kss.gmall.pms.service.impl;

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

}