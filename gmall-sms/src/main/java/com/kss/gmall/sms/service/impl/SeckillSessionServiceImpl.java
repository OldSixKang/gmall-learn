package com.kss.gmall.sms.service.impl;

import com.kss.gmall.sms.dao.SeckillSessionDao;
import com.kss.gmall.sms.entity.SeckillSession;
import com.kss.gmall.sms.service.SeckillSessionService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

@Service("seckillSessionService")
public class SeckillSessionServiceImpl extends ServiceImpl<SeckillSessionDao, SeckillSession> implements SeckillSessionService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SeckillSession> page = this.page(
                new Query<SeckillSession>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}