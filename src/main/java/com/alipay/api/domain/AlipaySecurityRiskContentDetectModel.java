package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序内容风险检测服务
 *
 * @author auto create
 * @since 1.0, 2018-07-09 10:13:15
 */
public class AlipaySecurityRiskContentDetectModel extends AlipayObject {

	private static final long serialVersionUID = 6463785426245383145L;

	/**
	 * 需要识别的文本，不要包含特殊字符以及双引号等可能引起json格式化错误问题的字符.
	 */
	@ApiField("content")
	private String content;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
