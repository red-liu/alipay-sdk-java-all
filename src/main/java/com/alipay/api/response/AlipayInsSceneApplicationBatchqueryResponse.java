package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsApplicationQuery;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:11
 */
public class AlipayInsSceneApplicationBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5292492789637418397L;

	/** 
	 * 投保单列表
	 */
	@ApiListField("applications")
	@ApiField("ins_application_query")
	private List<InsApplicationQuery> applications;

	public void setApplications(List<InsApplicationQuery> applications) {
		this.applications = applications;
	}
	public List<InsApplicationQuery> getApplications( ) {
		return this.applications;
	}

}
