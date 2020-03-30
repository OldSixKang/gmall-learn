package com.kss.gmall.ums.controller;

import java.util.Arrays;

import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;
import com.kss.core.bean.Resp;
import com.kss.gmall.ums.service.MemberLevelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.kss.gmall.ums.entity.MemberLevel;

/**
 * 会员等级
 * @author kss
 * @since  2020-03-29 17:13:18
 */
@Api(tags = "会员等级 管理")
@RestController
@RequestMapping("ums/memberlevel")
public class MemberLevelController {
    @Autowired
    private MemberLevelService memberLevelService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('ums:memberlevel:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = memberLevelService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('ums:memberlevel:info')")
    public Resp<MemberLevel> info(@PathVariable("id") Long id){
		MemberLevel memberLevel = memberLevelService.getById(id);

        return Resp.ok(memberLevel);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('ums:memberlevel:save')")
    public Resp<Object> save(@RequestBody MemberLevel memberLevel){
		memberLevelService.save(memberLevel);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('ums:memberlevel:update')")
    public Resp<Object> update(@RequestBody MemberLevel memberLevel){
		memberLevelService.updateById(memberLevel);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('ums:memberlevel:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		memberLevelService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
