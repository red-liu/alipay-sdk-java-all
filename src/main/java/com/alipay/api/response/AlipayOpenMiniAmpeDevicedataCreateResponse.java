package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.devicedata.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-06 17:47:44
 */
public class AlipayOpenMiniAmpeDevicedataCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5533862816367677478L;

	/** 
	 * 2000为失败，与ampe保持一致，在success为false时生效
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 上报失败原因
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 是否上报成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
