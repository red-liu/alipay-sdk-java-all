package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.freeze response.
 * 
 * @author auto create
 * @since 1.0, 2018-05-30 15:42:08
 */
public class KoubeiMerchantOperatorFreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 8729941671782443884L;

	/** 
	 * 操作结果 true:success, false: failed
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
