package com.kss.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.sms.entity.SpuLadder;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 商品阶梯价格
 *
 * @author kss
 * @since  2020-03-29 16:53:13
 */
public interface SpuLadderService extends IService<SpuLadder> {

    PageVo queryPage(QueryCondition params);
}

