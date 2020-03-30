package com.kss.gmall.ums.service.impl;

import com.kss.gmall.ums.dao.MemberCollectSpuDao;
import com.kss.gmall.ums.service.MemberCollectSpuService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

import com.kss.gmall.ums.entity.MemberCollectSpu;

@Service("memberCollectSpuService")
public class MemberCollectSpuServiceImpl extends ServiceImpl<MemberCollectSpuDao, MemberCollectSpu> implements MemberCollectSpuService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberCollectSpu> page = this.page(
                new Query<MemberCollectSpu>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}