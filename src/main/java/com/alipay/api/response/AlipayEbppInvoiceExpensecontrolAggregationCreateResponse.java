package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expensecontrol.aggregation.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-29 21:50:31
 */
public class AlipayEbppInvoiceExpensecontrolAggregationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8444646267328536584L;

	/** 
	 * 费控聚合关系ID
	 */
	@ApiField("aggregation_id")
	private String aggregationId;

	public void setAggregationId(String aggregationId) {
		this.aggregationId = aggregationId;
	}
	public String getAggregationId( ) {
		return this.aggregationId;
	}

}
