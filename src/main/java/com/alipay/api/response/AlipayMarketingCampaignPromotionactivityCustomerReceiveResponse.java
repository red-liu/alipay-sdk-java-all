package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.promotionactivity.customer.receive response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-18 15:05:29
 */
public class AlipayMarketingCampaignPromotionactivityCustomerReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7718553398224862973L;

	/** 
	 * 券模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
