package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.promo.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-26 09:25:30
 */
public class AlipayOpenAppServicePromoApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7872378448391632339L;

	/** 
	 * 服务场景素材记录ID
	 */
	@ApiField("promo_record_id")
	private String promoRecordId;

	public void setPromoRecordId(String promoRecordId) {
		this.promoRecordId = promoRecordId;
	}
	public String getPromoRecordId( ) {
		return this.promoRecordId;
	}

}
