package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户的电子社保卡或医保电子凭证基础信息
 *
 * @author auto create
 * @since 1.0, 2021-10-08 10:20:47
 */
public class AlipayCommerceMedicalCardAuthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3822959767776621178L;

	/**
	 * 机构编码
	 */
	@ApiField("ins_code")
	private String insCode;

	/**
	 * 持卡人与当前用户的关系
	 */
	@ApiField("relation_type")
	private String relationType;

	public String getInsCode() {
		return this.insCode;
	}
	public void setInsCode(String insCode) {
		this.insCode = insCode;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

}
