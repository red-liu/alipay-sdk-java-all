package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.unifygwtest.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 11:08:57
 */
public class AlipayOpenAuthUnifygwtestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6434279353119734317L;

	/** 
	 * 1
	 */
	@ApiField("des")
	private String des;

	public void setDes(String des) {
		this.des = des;
	}
	public String getDes( ) {
		return this.des;
	}

}
