package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TaskReceiveInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promoter.task.receive response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-09 11:20:33
 */
public class AlipayCommerceOperationPromoterTaskReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5613896769957835197L;

	/** 
	 * 积分领取结果
	 */
	@ApiField("task_receive_result")
	private TaskReceiveInfo taskReceiveResult;

	public void setTaskReceiveResult(TaskReceiveInfo taskReceiveResult) {
		this.taskReceiveResult = taskReceiveResult;
	}
	public TaskReceiveInfo getTaskReceiveResult( ) {
		return this.taskReceiveResult;
	}

}
