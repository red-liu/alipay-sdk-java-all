package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.newmsg.send response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 10:41:51
 */
public class AlipaySocialBaseChatNewmsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6538153964755814834L;

	/** 
	 * 消息索引号 会话ID_消息ID
	 */
	@ApiField("msg_index")
	private String msgIndex;

	public void setMsgIndex(String msgIndex) {
		this.msgIndex = msgIndex;
	}
	public String getMsgIndex( ) {
		return this.msgIndex;
	}

}
