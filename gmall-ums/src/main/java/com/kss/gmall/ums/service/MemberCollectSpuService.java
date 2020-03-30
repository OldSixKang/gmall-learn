package com.kss.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.ums.entity.MemberCollectSpu;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 会员收藏的商品
 *
 * @author kss
 * @since  2020-03-29 17:13:18
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpu> {

    PageVo queryPage(QueryCondition params);
}

