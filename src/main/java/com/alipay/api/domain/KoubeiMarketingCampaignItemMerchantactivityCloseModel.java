package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户下架代金券
 *
 * @author auto create
 * @since 1.0, 2018-07-06 17:36:02
 */
public class KoubeiMarketingCampaignItemMerchantactivityCloseModel extends AlipayObject {

	private static final long serialVersionUID = 1368754685111463857L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

}
