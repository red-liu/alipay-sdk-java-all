package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EnterpriseTitleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseexctrl.employertitle.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-29 13:36:34
 */
public class AlipayEbppInvoiceEnterpriseexctrlEmployertitleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8735547645428435923L;

	/** 
	 * 返回码
10000-成功
其他都是失败
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 返回消息
	 */
	@ApiField("msg")
	private String msg;

	/** 
	 * 企业抬头信息
	 */
	@ApiField("title_info")
	private EnterpriseTitleInfo titleInfo;

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

	public void setTitleInfo(EnterpriseTitleInfo titleInfo) {
		this.titleInfo = titleInfo;
	}
	public EnterpriseTitleInfo getTitleInfo( ) {
		return this.titleInfo;
	}

}
