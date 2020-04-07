package com.kss.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.pms.entity.AttrGroup;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;
import com.kss.gmall.pms.vo.GroupVO;

import java.util.List;

/**
 * 属性分组
 *
 * @author kss
 * @since  2020-03-28 17:00:25
 */
public interface AttrGroupService extends IService<AttrGroup> {

    PageVo queryPage(QueryCondition params);

    PageVo queryGroupByPage(Long catId, QueryCondition queryCondition);

    GroupVO queryGroupWithAttrsByGid(Long gid);

    List<GroupVO> queryGroupWithAttrsByGatId(Long catId);
}

