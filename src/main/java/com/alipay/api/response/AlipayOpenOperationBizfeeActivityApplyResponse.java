package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.bizfee.activity.apply response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 15:44:07
 */
public class AlipayOpenOperationBizfeeActivityApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3477853132963825621L;

	/** 
	 * 返回结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 返回结果描述信息
	 */
	@ApiField("result_message")
	private String resultMessage;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

}
