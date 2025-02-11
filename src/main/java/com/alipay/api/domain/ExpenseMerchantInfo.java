package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户信息
 *
 * @author auto create
 * @since 1.0, 2021-09-24 16:47:19
 */
public class ExpenseMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 7398792888952752235L;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户角色ID
	 */
	@ApiField("role_id")
	private String roleId;

	/**
	 * 角色类型
0-直连商户
1-间联商户
	 */
	@ApiField("role_type")
	private String roleType;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getRoleId() {
		return this.roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
