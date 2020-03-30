package com.kss.gmall.sms.service.impl;

import com.kss.gmall.sms.dao.HomeSubjectSpuDao;
import com.kss.gmall.sms.entity.HomeSubjectSpu;
import com.kss.gmall.sms.service.HomeSubjectSpuService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

@Service("homeSubjectSpuService")
public class HomeSubjectSpuServiceImpl extends ServiceImpl<HomeSubjectSpuDao, HomeSubjectSpu> implements HomeSubjectSpuService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<HomeSubjectSpu> page = this.page(
                new Query<HomeSubjectSpu>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}