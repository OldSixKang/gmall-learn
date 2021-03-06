package com.kss.gmall.oms.controller;

import java.util.Arrays;

import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;
import com.kss.core.bean.Resp;
import com.kss.gmall.oms.entity.OrderSetting;
import com.kss.gmall.oms.service.OrderSettingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

/**
 * 订单配置信息
 * @author kss
 * @since  2020-03-29 17:24:55
 */
@Api(tags = "订单配置信息 管理")
@RestController
@RequestMapping("oms/ordersetting")
public class OrderSettingController {
    @Autowired
    private OrderSettingService orderSettingService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('oms:ordersetting:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = orderSettingService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('oms:ordersetting:info')")
    public Resp<OrderSetting> info(@PathVariable("id") Long id){
		OrderSetting orderSetting = orderSettingService.getById(id);

        return Resp.ok(orderSetting);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('oms:ordersetting:save')")
    public Resp<Object> save(@RequestBody OrderSetting orderSetting){
		orderSettingService.save(orderSetting);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('oms:ordersetting:update')")
    public Resp<Object> update(@RequestBody OrderSetting orderSetting){
		orderSettingService.updateById(orderSetting);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('oms:ordersetting:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		orderSettingService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
