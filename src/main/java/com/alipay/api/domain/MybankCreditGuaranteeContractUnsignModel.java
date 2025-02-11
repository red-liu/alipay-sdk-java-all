package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 担保服务取消
 *
 * @author auto create
 * @since 1.0, 2021-09-26 17:31:44
 */
public class MybankCreditGuaranteeContractUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 5511682358432323928L;

	/**
	 * 会员站点：AE:速卖通，ALIPAY:支付宝，MYBANK:网商银行，TAOBAO：淘宝，B2B_CN：中文站，B2B_EN：国际站
	 */
	@ApiField("site")
	private String site;

	/**
	 * 会员站点ID
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteUserId() {
		return this.siteUserId;
	}
	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

}
