package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报销账单信息
 *
 * @author auto create
 * @since 1.0, 2021-09-28 16:54:56
 */
public class ExpenseConsumeInfo extends AlipayObject {

	private static final long serialVersionUID = 2388252767357281949L;

	/**
	 * 公司账号ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 实际出资账号（实际出资人实名认证名称)
	 */
	@ApiField("actual_account_number")
	private String actualAccountNumber;

	/**
	 * 汇总批次id
	 */
	@ApiField("batch_id")
	private String batchId;

	/**
	 * 支付流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 账单类型（CONSUME-消费账单、REFUND-退款、TRANSFER-转账）
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 账单行业分类（交通出行，餐饮美食，商业服务，日用百货等等）
	 */
	@ApiField("category_name")
	private String categoryName;

	/**
	 * 账单金额
	 */
	@ApiField("consume_amount")
	private String consumeAmount;

	/**
	 * 交易日期
	 */
	@ApiField("consume_date")
	private String consumeDate;

	/**
	 * 账单展示标题
	 */
	@ApiField("consume_title")
	private String consumeTitle;

	/**
	 * 所属员工支付宝uid
	 */
	@ApiField("employee_id")
	private String employeeId;

	/**
	 * 开票模式
	 */
	@ApiField("open_model")
	private String openModel;

	/**
	 * 退款交易关联正交易单号
	 */
	@ApiField("original_voucher_id")
	private String originalVoucherId;

	/**
	 * 外部流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 企业代付金额
	 */
	@ApiField("p_pay_amount")
	private String pPayAmount;

	/**
	 * 商家名称
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 费控制度中的项目编号
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 支付使用的项目号（成本中心）此字段废弃
	 */
	@ApiField("projiect_id")
	private String projiectId;

	/**
	 * 制度id
	 */
	@ApiField("standard_id")
	private String standardId;

	/**
	 * tp标志位
	 */
	@ApiField("tp_sign")
	private String tpSign;

	/**
	 * 凭证id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getActualAccountNumber() {
		return this.actualAccountNumber;
	}
	public void setActualAccountNumber(String actualAccountNumber) {
		this.actualAccountNumber = actualAccountNumber;
	}

	public String getBatchId() {
		return this.batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getCategoryName() {
		return this.categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getConsumeAmount() {
		return this.consumeAmount;
	}
	public void setConsumeAmount(String consumeAmount) {
		this.consumeAmount = consumeAmount;
	}

	public String getConsumeDate() {
		return this.consumeDate;
	}
	public void setConsumeDate(String consumeDate) {
		this.consumeDate = consumeDate;
	}

	public String getConsumeTitle() {
		return this.consumeTitle;
	}
	public void setConsumeTitle(String consumeTitle) {
		this.consumeTitle = consumeTitle;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getOpenModel() {
		return this.openModel;
	}
	public void setOpenModel(String openModel) {
		this.openModel = openModel;
	}

	public String getOriginalVoucherId() {
		return this.originalVoucherId;
	}
	public void setOriginalVoucherId(String originalVoucherId) {
		this.originalVoucherId = originalVoucherId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getpPayAmount() {
		return this.pPayAmount;
	}
	public void setpPayAmount(String pPayAmount) {
		this.pPayAmount = pPayAmount;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjiectId() {
		return this.projiectId;
	}
	public void setProjiectId(String projiectId) {
		this.projiectId = projiectId;
	}

	public String getStandardId() {
		return this.standardId;
	}
	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

	public String getTpSign() {
		return this.tpSign;
	}
	public void setTpSign(String tpSign) {
		this.tpSign = tpSign;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
