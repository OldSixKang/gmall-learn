package com.kss.gmall.sms.service.impl;

import com.kss.gmall.sms.dao.SeckillSkuNoticeDao;
import com.kss.gmall.sms.entity.SeckillSkuNotice;
import com.kss.gmall.sms.service.SeckillSkuNoticeService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

@Service("seckillSkuNoticeService")
public class SeckillSkuNoticeServiceImpl extends ServiceImpl<SeckillSkuNoticeDao, SeckillSkuNotice> implements SeckillSkuNoticeService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SeckillSkuNotice> page = this.page(
                new Query<SeckillSkuNotice>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}