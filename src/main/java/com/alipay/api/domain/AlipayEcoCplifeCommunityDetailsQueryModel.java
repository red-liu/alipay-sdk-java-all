package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询单个物业小区信息
 *
 * @author auto create
 * @since 1.0, 2021-04-09 14:43:01
 */
public class AlipayEcoCplifeCommunityDetailsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5629174483696222762L;

	/**
	 * 支付宝社区小区统一编号，必须在物业账号名下存在。
	 */
	@ApiField("community_id")
	private String communityId;

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

}
