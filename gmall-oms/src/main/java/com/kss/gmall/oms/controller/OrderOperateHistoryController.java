package com.kss.gmall.oms.controller;

import java.util.Arrays;

import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;
import com.kss.core.bean.Resp;
import com.kss.gmall.oms.entity.OrderOperateHistory;
import com.kss.gmall.oms.service.OrderOperateHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * 订单操作历史记录
 * @author kss
 * @since  2020-03-29 17:24:55
 */
@Api(tags = "订单操作历史记录 管理")
@RestController
@RequestMapping("oms/orderoperatehistory")
public class OrderOperateHistoryController {
    @Autowired
    private OrderOperateHistoryService orderOperateHistoryService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('oms:orderoperatehistory:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = orderOperateHistoryService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('oms:orderoperatehistory:info')")
    public Resp<OrderOperateHistory> info(@PathVariable("id") Long id){
		OrderOperateHistory orderOperateHistory = orderOperateHistoryService.getById(id);

        return Resp.ok(orderOperateHistory);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('oms:orderoperatehistory:save')")
    public Resp<Object> save(@RequestBody OrderOperateHistory orderOperateHistory){
		orderOperateHistoryService.save(orderOperateHistory);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('oms:orderoperatehistory:update')")
    public Resp<Object> update(@RequestBody OrderOperateHistory orderOperateHistory){
		orderOperateHistoryService.updateById(orderOperateHistory);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('oms:orderoperatehistory:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		orderOperateHistoryService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
