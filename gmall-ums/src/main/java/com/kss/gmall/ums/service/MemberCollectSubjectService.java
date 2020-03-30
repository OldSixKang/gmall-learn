package com.kss.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.ums.entity.MemberCollectSubject;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;

/**
 * 会员收藏的专题活动
 *
 * @author kss
 * @since  2020-03-29 17:13:18
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubject> {

    PageVo queryPage(QueryCondition params);
}

