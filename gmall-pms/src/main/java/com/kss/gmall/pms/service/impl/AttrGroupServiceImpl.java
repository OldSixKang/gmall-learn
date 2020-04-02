package com.kss.gmall.pms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;
import com.kss.gmall.pms.dao.AttrAttrgroupRelationDao;
import com.kss.gmall.pms.dao.AttrDao;
import com.kss.gmall.pms.dao.AttrGroupDao;
import com.kss.gmall.pms.entity.Attr;
import com.kss.gmall.pms.entity.AttrAttrgroupRelation;
import com.kss.gmall.pms.entity.AttrGroup;
import com.kss.gmall.pms.service.AttrGroupService;
import com.kss.gmall.pms.vo.GroupVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroup> implements AttrGroupService {

    @Autowired(required = false)
    private AttrAttrgroupRelationDao relationDao;
    @Autowired(required = false)
    private AttrDao attrDao;

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AttrGroup> page = this.page(
                new Query<AttrGroup>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo<>(page);
    }

    @Override
    public PageVo queryGroupByPage(Long catId, QueryCondition queryCondition) {
        QueryWrapper<AttrGroup> wrapper = new QueryWrapper<>();
        if (catId != null) {
            wrapper.eq("catelog_id", catId);
        }

        IPage<AttrGroup> page = this.page(
                new Query<AttrGroup>().getPage(queryCondition),
                wrapper
        );

        return new PageVo<>(page);
    }

    @Override
    public GroupVO queryGroupWithAttrsByGid(Long gid) {
        GroupVO groupVO = new GroupVO();

        // 1、查询group
        AttrGroup attrGroup = this.getById(gid);
        if (attrGroup != null) {
            BeanUtils.copyProperties(attrGroup, groupVO);
        }

        // 2、根据gid查询关联关系
        List<AttrAttrgroupRelation> relations = this.relationDao.selectList(new QueryWrapper<AttrAttrgroupRelation>().eq("attr_group_id", gid));
        if (CollectionUtils.isEmpty(relations)) {
            return groupVO;
        }
        groupVO.setRelations(relations);

        // 3、根据attrIds查询所有规格参数
        List<Long> attrIds = relations.stream().map(AttrAttrgroupRelation::getAttrId).collect(Collectors.toList());
        List<Attr> attrEntities = this.attrDao.selectBatchIds(attrIds);
        groupVO.setAttrEntities(attrEntities);

        return groupVO;
    }

}