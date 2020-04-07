package com.kss.gmall.pms.service.impl;

import com.kss.gmall.pms.dao.SkuInfoDao;
import com.kss.gmall.pms.dao.SpuInfoDescDao;
import com.kss.gmall.pms.entity.*;
import com.kss.gmall.pms.fegin.GmallSmsClient;
import com.kss.gmall.pms.service.ProductAttrValueService;
import com.kss.gmall.pms.service.SkuImagesService;
import com.kss.gmall.pms.service.SkuSaleAttrValueService;
import com.kss.gmall.pms.vo.BaseAttrVO;
import com.kss.gmall.pms.vo.SkuInfoVO;
import com.kss.gmall.pms.vo.SpuInfoVO;
import com.kss.gmall.sms.vo.SkuSaleVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kss.core.bean.PageVo;
import com.kss.core.bean.Query;
import com.kss.core.bean.QueryCondition;

import com.kss.gmall.pms.dao.SpuInfoDao;
import com.kss.gmall.pms.service.SpuInfoService;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service("spuInfoService")
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoDao, SpuInfo> implements SpuInfoService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuInfo> page = this.page(
                new Query<SpuInfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

    @Override
    public PageVo querySpuPage(QueryCondition queryCondition, Long catId) {
        // 1、
        QueryWrapper<SpuInfo> wrapper = new QueryWrapper<>();
        // 判断分类是否为0
        if (catId == 0L) {
            wrapper.eq("catalog_id", catId);
        }
        // 判断关键字是否为空
        String key = queryCondition.getKey();
        if (StringUtils.isNoneEmpty(key)) {
            wrapper.and(e -> e.eq("id", key).or().like("spu_name", key));
        }

        IPage<SpuInfo> page = this.page(
                new Query<SpuInfo>().getPage(queryCondition),
                wrapper
        );

        return new PageVo(page);
    }

    @Autowired
    private SpuInfoDescDao descDao;
    @Autowired
    private ProductAttrValueService attrValueService;
    @Autowired
    private SkuInfoDao skuInfoDao;
    @Autowired
    private SkuImagesService skuImagesService;
    @Autowired
    private SkuSaleAttrValueService skuSaleAttrValueService;
    @Autowired
    private GmallSmsClient gmallSmsClient;

    @Override
    public void bigSave(SpuInfoVO spuInfoVO) {
        // 1、保存spu相关的3张表
        // 1.1 保存pms_spu_info
        spuInfoVO.setCreateTime(new Date());
        spuInfoVO.setUpdateTime(spuInfoVO.getCreateTime());
        this.save(spuInfoVO);

        Long spuId = spuInfoVO.getId();

        // 1.2 保存pms_spu_info_desc
        List<String> spuImages = spuInfoVO.getSpuImages();
        if (!CollectionUtils.isEmpty(spuImages)) {
            SpuInfoDesc spuInfoDesc = new SpuInfoDesc();
            spuInfoDesc.setSpuId(spuId);
            spuInfoDesc.setDecript(StringUtils.join(spuImages, ","));
            this.descDao.insert(spuInfoDesc);
        }

        // 1.3 保存pms_product_attr_value
        List<BaseAttrVO> baseAttrs = spuInfoVO.getBaseAttrs();
        if (!CollectionUtils.isEmpty(baseAttrs)) {
            List<ProductAttrValue> productAttrValueList = baseAttrs.stream()
                    .map(item -> {
                        ProductAttrValue productAttrValue = (ProductAttrValue) item;
                        productAttrValue.setSpuId(spuId);
                        return productAttrValue;
                    }).collect(Collectors.toList());
            this.attrValueService.saveBatch(productAttrValueList);
        }

        // 2、保存sku相关的3张表
        List<SkuInfoVO> skus = spuInfoVO.getSkus();
        if (CollectionUtils.isEmpty(skus)) {
            return;
        }
        skus.forEach(skuInfoVO -> {
            // 2.1 保存pms_sku_info
            skuInfoVO.setSpuId(spuId);
            skuInfoVO.setSkuCode(UUID.randomUUID().toString());
            skuInfoVO.setBrandId(spuInfoVO.getBrandId());
            skuInfoVO.setCatalogId(spuInfoVO.getCatalogId());
            List<String> images = skuInfoVO.getImages();
            if (!CollectionUtils.isEmpty(images)) {
                // 设置默认图片
                skuInfoVO.setSkuDefaultImg(StringUtils.isNotBlank(skuInfoVO.getSkuDefaultImg())
                        ? skuInfoVO.getSkuDefaultImg() : images.get(0));
            }
            this.skuInfoDao.insert(skuInfoVO);
            Long skuId = skuInfoVO.getSkuId();

            // 2.2 保存pms_spu_images
            if (!CollectionUtils.isEmpty(images)) {
                List<SkuImages> skuImagesList = images.stream().map(e -> {
                    SkuImages skuImages = new SkuImages();
                    skuImages.setImgUrl(e);
                    skuImages.setSkuId(skuId);
                    // 设置是否为默认图片
                    skuImages.setDefaultImg(StringUtils.equals(skuInfoVO.getSkuDefaultImg(), e) ? 1 : 0);
                    return skuImages;
                }).collect(Collectors.toList());
                this.skuImagesService.saveBatch(skuImagesList);
            }

            // 2.3 保存pms_sale_attr_value
            List<SkuSaleAttrValue> saleAttrs = skuInfoVO.getSaleAttrs();
            if (!CollectionUtils.isEmpty(saleAttrs)) {
                saleAttrs.forEach(e -> e.setSkuId(skuId));
                // 批量保存销售属性
                this.skuSaleAttrValueService.saveBatch(saleAttrs);
            }

            // 3、保存营销信息相关的3张表（通过Feign远程调用保存）
            // 3.1 保存sms_sku_bounds
            // 3.2 保存sms_sku_ladder
            // 3.3 保存sms_sku_full_reduction
            SkuSaleVO skuSaleVO = new SkuSaleVO();
            BeanUtils.copyProperties(skuInfoVO, skuSaleVO);
            skuSaleVO.setSkuId(skuId);
            this.gmallSmsClient.saveSale(skuSaleVO);
        });

    }

}