package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务修改
 *
 * @author auto create
 * @since 1.0, 2021-08-23 15:01:17
 */
public class AlipayOpenAppServiceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5197137687524757594L;

	/**
	 * 服务schema版本
	 */
	@ApiField("schema_version")
	private String schemaVersion;

	/**
	 * 服务id
	 */
	@ApiField("service_code")
	private String serviceCode;

	/**
	 * 服务内容xml格式
	 */
	@ApiField("service_xml")
	private String serviceXml;

	public String getSchemaVersion() {
		return this.schemaVersion;
	}
	public void setSchemaVersion(String schemaVersion) {
		this.schemaVersion = schemaVersion;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceXml() {
		return this.serviceXml;
	}
	public void setServiceXml(String serviceXml) {
		this.serviceXml = serviceXml;
	}

}
