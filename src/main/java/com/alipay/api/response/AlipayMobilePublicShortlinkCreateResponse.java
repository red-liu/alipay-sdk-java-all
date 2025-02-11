package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.shortlink.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-13 20:57:17
 */
public class AlipayMobilePublicShortlinkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4732354473457642631L;

	/** 
	 * 结果码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 成功
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 短链接url
	 */
	@ApiField("shortlink")
	private String shortlink;

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

	public void setShortlink(String shortlink) {
		this.shortlink = shortlink;
	}
	public String getShortlink( ) {
		return this.shortlink;
	}

}
