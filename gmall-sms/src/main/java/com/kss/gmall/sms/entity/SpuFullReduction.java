package com.kss.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;

import lombok.Data;

/**
 * 商品满减信息
 * @author kss
 * @since 2020-03-29 16:53:13
 */
@ApiModel
@Data
@TableName("sms_spu_full_reduction")
public class SpuFullReduction implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * spu_id
	 */
	@ApiModelProperty(name = "spuId",value = "spu_id")
	private Long spuId;
	/**
	 * 满多少
	 */
	@ApiModelProperty(name = "fullPrice",value = "满多少")
	private BigDecimal fullPrice;
	/**
	 * 减多少
	 */
	@ApiModelProperty(name = "reducePrice",value = "减多少")
	private BigDecimal reducePrice;
	/**
	 * 是否参与其他优惠
	 */
	@ApiModelProperty(name = "addOther",value = "是否参与其他优惠")
	private Integer addOther;

}
