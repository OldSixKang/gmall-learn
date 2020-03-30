package com.kss.gmall.sms.service.impl;

import com.kss.gmall.sms.dao.SpuLadderDao;
import com.kss.gmall.sms.entity.SpuLadder;
import com.kss.gmall.sms.service.SpuLadderService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

@Service("spuLadderService")
public class SpuLadderServiceImpl extends ServiceImpl<SpuLadderDao, SpuLadder> implements SpuLadderService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuLadder> page = this.page(
                new Query<SpuLadder>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}