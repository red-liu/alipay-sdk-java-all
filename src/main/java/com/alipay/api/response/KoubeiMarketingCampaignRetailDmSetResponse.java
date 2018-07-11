package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.retail.dm.set response.
 * 
 * @author auto create
 * @since 1.0, 2017-12-07 22:23:36
 */
public class KoubeiMarketingCampaignRetailDmSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8395323581477164625L;

	/** 
	 * 内容ID
	 */
	@ApiField("content_id")
	private String contentId;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

}
