package com.kss.gmall.pms.controller;

import java.util.Arrays;
import java.util.List;

import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;
import com.kss.core.bean.Resp;
import com.kss.gmall.pms.entity.AttrGroup;
import com.kss.gmall.pms.service.AttrGroupService;
import com.kss.gmall.pms.vo.GroupVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * 属性分组
 * @author kss
 * @since  2020-03-28 17:00:25
 */
@Api(tags = "属性分组 管理")
@RestController
@RequestMapping("pms/attrgroup")
public class AttrGroupController {
    @Autowired
    private AttrGroupService attrGroupService;

    @GetMapping("withattr/cat/{catId}")
    public Resp<List<GroupVO>> queryGroupWithAttrsByGatId(@PathVariable("catId") Long catId) {
        List<GroupVO> groupVOS = attrGroupService.queryGroupWithAttrsByGatId(catId);
        return Resp.ok(groupVOS);
    }

    @GetMapping("withattr/{gid}")
    public Resp<GroupVO> queryGroupWithAttrsByGid(@PathVariable("gid") Long gid) {
        GroupVO groupVOS = attrGroupService.queryGroupWithAttrsByGid(gid);
        return Resp.ok(groupVOS);
    }

    @ApiOperation("属性分组")
    @GetMapping("{catId}")
    public Resp<PageVo> queryGroupByPage(@PathVariable("catId") Long catId,
                                         QueryCondition queryCondition) {
        PageVo page = attrGroupService.queryGroupByPage(catId, queryCondition);
        return Resp.ok(page);
    }

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:attrgroup:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = attrGroupService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{attrGroupId}")
    @PreAuthorize("hasAuthority('pms:attrgroup:info')")
    public Resp<AttrGroup> info(@PathVariable("attrGroupId") Long attrGroupId){
		AttrGroup attrGroup = attrGroupService.getById(attrGroupId);

        return Resp.ok(attrGroup);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:attrgroup:save')")
    public Resp<Object> save(@RequestBody AttrGroup attrGroup){
		attrGroupService.save(attrGroup);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:attrgroup:update')")
    public Resp<Object> update(@RequestBody AttrGroup attrGroup){
		attrGroupService.updateById(attrGroup);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:attrgroup:delete')")
    public Resp<Object> delete(@RequestBody Long[] attrGroupIds){
		attrGroupService.removeByIds(Arrays.asList(attrGroupIds));

        return Resp.ok(null);
    }

}
