package com.kss.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.ums.entity.GrowthChangeHistory;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 成长值变化历史记录
 *
 * @author kss
 * @since  2020-03-29 17:13:18
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistory> {

    PageVo queryPage(QueryCondition params);
}

