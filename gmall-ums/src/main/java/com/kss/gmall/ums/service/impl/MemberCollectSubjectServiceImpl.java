package com.kss.gmall.ums.service.impl;

import com.kss.gmall.ums.dao.MemberCollectSubjectDao;
import com.kss.gmall.ums.service.MemberCollectSubjectService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

import com.kss.gmall.ums.entity.MemberCollectSubject;

@Service("memberCollectSubjectService")
public class MemberCollectSubjectServiceImpl extends ServiceImpl<MemberCollectSubjectDao, MemberCollectSubject> implements MemberCollectSubjectService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberCollectSubject> page = this.page(
                new Query<MemberCollectSubject>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}