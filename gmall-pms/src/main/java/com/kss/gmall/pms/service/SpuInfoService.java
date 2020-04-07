package com.kss.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kss.gmall.pms.entity.SpuInfo;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.QueryCondition;
import com.kss.gmall.pms.vo.SpuInfoVO;

/**
 * spu信息
 *
 * @author kss
 * @since  2020-03-28 17:00:25
 */
public interface SpuInfoService extends IService<SpuInfo> {

    PageVo queryPage(QueryCondition params);

    PageVo querySpuPage(QueryCondition queryCondition, Long catId);

    void bigSave(SpuInfoVO spuInfoVO);
}

