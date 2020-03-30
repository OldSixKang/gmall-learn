package com.kss.gmall.sms.service.impl;

import com.kss.gmall.sms.dao.CategoryBoundsDao;
import com.kss.gmall.sms.entity.CategoryBounds;
import com.kss.gmall.sms.service.CategoryBoundsService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

@Service("categoryBoundsService")
public class CategoryBoundsServiceImpl extends ServiceImpl<CategoryBoundsDao, CategoryBounds> implements CategoryBoundsService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<CategoryBounds> page = this.page(
                new Query<CategoryBounds>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}