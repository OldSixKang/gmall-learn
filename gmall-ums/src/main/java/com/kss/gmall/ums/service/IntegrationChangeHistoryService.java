package com.kss.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.ums.entity.IntegrationChangeHistory;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 积分变化历史记录
 *
 * @author kss
 * @since  2020-03-29 17:13:18
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistory> {

    PageVo queryPage(QueryCondition params);
}

