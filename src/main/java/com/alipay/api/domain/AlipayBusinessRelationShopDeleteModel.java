package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝代运营商业关系门店删除
 *
 * @author auto create
 * @since 1.0, 2021-07-12 11:41:49
 */
public class AlipayBusinessRelationShopDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5499739746986873411L;

	/**
	 * 商业关系组织id 由组织信息创建接口返回或bd分配
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 商业关系组织子类型 定向参数 需找对应BD申请
	 */
	@ApiField("group_sub_type")
	private String groupSubType;

	/**
	 * 商业关系组织类型 定向参数 需找对应BD申请
	 */
	@ApiField("group_type")
	private String groupType;

	/**
	 * 商业关系门店id alipay.agent.marketing.business.relation.shop.create接口返回
	 */
	@ApiField("real_shop_id")
	private String realShopId;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupSubType() {
		return this.groupSubType;
	}
	public void setGroupSubType(String groupSubType) {
		this.groupSubType = groupSubType;
	}

	public String getGroupType() {
		return this.groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

	public String getRealShopId() {
		return this.realShopId;
	}
	public void setRealShopId(String realShopId) {
		this.realShopId = realShopId;
	}

}
