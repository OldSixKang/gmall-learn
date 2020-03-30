package com.kss.gmall.wms.dao;

import com.kss.gmall.wms.entity.WareSku;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * @author kss
 * @since  2020-03-29 17:19:20
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSku> {
	
}
