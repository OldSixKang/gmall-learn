package com.kss.gmall.ums.service.impl;

import com.kss.gmall.ums.dao.MemberDao;
import com.kss.gmall.ums.service.MemberService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

import com.kss.gmall.ums.entity.Member;

@Service("memberService")
public class MemberServiceImpl extends ServiceImpl<MemberDao, Member> implements MemberService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<Member> page = this.page(
                new Query<Member>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}