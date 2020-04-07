package com.kss.gmall.pms.vo;

import com.kss.gmall.pms.entity.SpuInfo;
import lombok.Data;

import java.util.List;

@Data
public class SpuInfoVO extends SpuInfo {

    private List<String> spuImages;

    private List<BaseAttrVO> baseAttrs;

    private List<SkuInfoVO> skus;
}
