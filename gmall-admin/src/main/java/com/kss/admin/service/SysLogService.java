package com.kss.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.admin.common.util.PageUtils;
import com.kss.admin.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
