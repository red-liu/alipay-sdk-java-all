package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品库关键信息查询接口
 *
 * @author auto create
 * @since 1.0, 2021-09-10 15:59:55
 */
public class KoubeiCateringDishPrincipalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2627978992991142516L;

	/**
	 * 业务类型：
OUT_DISH_ID_SKU_ID_TO_ITEM_ID_SKU_ID
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 外部菜品id（如星巴克的spu id等）
	 */
	@ApiField("out_dish_id")
	private String outDishId;

	/**
	 * 外部sku id（如星巴克的poskey等）
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOutDishId() {
		return this.outDishId;
	}
	public void setOutDishId(String outDishId) {
		this.outDishId = outDishId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

}
