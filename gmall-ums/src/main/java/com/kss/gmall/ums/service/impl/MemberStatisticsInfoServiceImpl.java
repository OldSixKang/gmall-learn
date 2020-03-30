package com.kss.gmall.ums.service.impl;

import com.kss.gmall.ums.dao.MemberStatisticsInfoDao;
import com.kss.gmall.ums.service.MemberStatisticsInfoService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

import com.kss.gmall.ums.entity.MemberStatisticsInfo;

@Service("memberStatisticsInfoService")
public class MemberStatisticsInfoServiceImpl extends ServiceImpl<MemberStatisticsInfoDao, MemberStatisticsInfo> implements MemberStatisticsInfoService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberStatisticsInfo> page = this.page(
                new Query<MemberStatisticsInfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}