package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.facefeature.delete response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-23 15:19:41
 */
public class AlipayCommerceEducateFacefeatureDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5375144223633395513L;

	/** 
	 * 出库失败的faceId集合。
	 */
	@ApiListField("face_ids")
	@ApiField("string")
	private List<String> faceIds;

	public void setFaceIds(List<String> faceIds) {
		this.faceIds = faceIds;
	}
	public List<String> getFaceIds( ) {
		return this.faceIds;
	}

}
