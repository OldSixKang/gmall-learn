package com.kss.gmall.sms.service.impl;

import com.kss.gmall.sms.dao.MemberPriceDao;
import com.kss.gmall.sms.entity.MemberPrice;
import com.kss.gmall.sms.service.MemberPriceService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

@Service("memberPriceService")
public class MemberPriceServiceImpl extends ServiceImpl<MemberPriceDao, MemberPrice> implements MemberPriceService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberPrice> page = this.page(
                new Query<MemberPrice>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}