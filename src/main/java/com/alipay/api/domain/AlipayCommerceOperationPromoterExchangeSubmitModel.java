package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 积分兑换奖品点击确认
 *
 * @author auto create
 * @since 1.0, 2021-10-09 11:18:21
 */
public class AlipayCommerceOperationPromoterExchangeSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1414669842144522396L;

	/**
	 * 交兑换订单时作为外部订单号,用于防重复提交
	 */
	@ApiField("exchange_token")
	private String exchangeToken;

	/**
	 * 奖品code,唯一标识
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 需要绑定的门店对映的pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 积分数
	 */
	@ApiField("point_amount")
	private Long pointAmount;

	/**
	 * 店员id，点击提交的收银员id
	 */
	@ApiField("user_id")
	private String userId;

	public String getExchangeToken() {
		return this.exchangeToken;
	}
	public void setExchangeToken(String exchangeToken) {
		this.exchangeToken = exchangeToken;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public Long getPointAmount() {
		return this.pointAmount;
	}
	public void setPointAmount(Long pointAmount) {
		this.pointAmount = pointAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
