package com.kss.gmall.ums.service.impl;

import com.kss.gmall.ums.dao.MemberReceiveAddressDao;
import com.kss.gmall.ums.service.MemberReceiveAddressService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

import com.kss.gmall.ums.entity.MemberReceiveAddress;

@Service("memberReceiveAddressService")
public class MemberReceiveAddressServiceImpl extends ServiceImpl<MemberReceiveAddressDao, MemberReceiveAddress> implements MemberReceiveAddressService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberReceiveAddress> page = this.page(
                new Query<MemberReceiveAddress>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}