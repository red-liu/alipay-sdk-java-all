package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayOpenMiniBaseinfoModifyResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.open.mini.baseinfo.modify request
 * 
 * @author auto create
 * @since 1.0, 2021-10-08 17:40:15
 */
public class AlipayOpenMiniBaseinfoModifyRequest implements AlipayUploadRequest<AlipayOpenMiniBaseinfoModifyResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 11_12;12_13。小程序类目，格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目，详细类目可以参考https://docs.open.alipay.com/api_49/alipay.open.mini.category.query接口查询mini_category_list 。
	 */
	private String appCategoryIds;

	/** 
	* 小程序应用描述，20-200个字。若小程序应用未设置该项内容时必传，若小程序应用已设置且无需修改则无需传入。
	 */
	private String appDesc;

	/** 
	* 小程序应用英文名称。若小程序应用未设置该项内容时必传，若小程序应用已设置且无需修改则无需传入。
	 */
	private String appEnglishName;

	/** 
	* 小程序应用logo图标，图片格式必须为：png、jpeg、jpg，建议上传像素为180*180。
若小程序应用未设置该项内容时必传，若小程序应用已设置且无需修改则无需传入。
	 */
	private FileItem appLogo;

	/** 
	* 小程序应用名称。若小程序应用未设置该项内容时必传，若小程序应用已设置且无需修改则无需传入。
	 */
	private String appName;

	/** 
	* 小程序应用简介，一句话描述小程序功能。若小程序应用未设置该项内容时必传，若小程序应用已设置且无需修改则无需传入。
	 */
	private String appSlogan;

	/** 
	* 新小程序前台类目。格式为 第一个一级类目_第一个二级类目;第二个一级类目_第二个二级类目_第二个三级类目。详细类目可以通过 https://docs.open.alipay.com/api_49/alipay.open.mini.category.query接口查询mini_category_list。
如需申请用户信息则该项必填，否则应用后台不会展示用户信息申请入口；通过接口申请用户信息会被直接驳回。
	 */
	private String miniCategoryIds;

	/** 
	* 小程序客服邮箱。若小程序应用未设置该项内容时必传，若小程序应用已设置且无需修改则无需传入。
	 */
	private String serviceEmail;

	/** 
	* 小程序客服电话。若小程序应用未设置该项内容时必传，若小程序应用已设置且无需修改则无需传入。
	 */
	private String servicePhone;

	public void setAppCategoryIds(String appCategoryIds) {
		this.appCategoryIds = appCategoryIds;
	}
	public String getAppCategoryIds() {
		return this.appCategoryIds;
	}

	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}
	public String getAppDesc() {
		return this.appDesc;
	}

	public void setAppEnglishName(String appEnglishName) {
		this.appEnglishName = appEnglishName;
	}
	public String getAppEnglishName() {
		return this.appEnglishName;
	}

	public void setAppLogo(FileItem appLogo) {
		this.appLogo = appLogo;
	}
	public FileItem getAppLogo() {
		return this.appLogo;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppName() {
		return this.appName;
	}

	public void setAppSlogan(String appSlogan) {
		this.appSlogan = appSlogan;
	}
	public String getAppSlogan() {
		return this.appSlogan;
	}

	public void setMiniCategoryIds(String miniCategoryIds) {
		this.miniCategoryIds = miniCategoryIds;
	}
	public String getMiniCategoryIds() {
		return this.miniCategoryIds;
	}

	public void setServiceEmail(String serviceEmail) {
		this.serviceEmail = serviceEmail;
	}
	public String getServiceEmail() {
		return this.serviceEmail;
	}

	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}
	public String getServicePhone() {
		return this.servicePhone;
	}
	private String terminalType;
	private String terminalInfo;
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
    private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}
	
    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "alipay.open.mini.baseinfo.modify";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("app_category_ids", this.appCategoryIds);
		txtParams.put("app_desc", this.appDesc);
		txtParams.put("app_english_name", this.appEnglishName);
		txtParams.put("app_name", this.appName);
		txtParams.put("app_slogan", this.appSlogan);
		txtParams.put("mini_category_ids", this.miniCategoryIds);
		txtParams.put("service_email", this.serviceEmail);
		txtParams.put("service_phone", this.servicePhone);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
	
	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("app_logo", this.appLogo);
		return params;
	}

	public Class<AlipayOpenMiniBaseinfoModifyResponse> getResponseClass() {
		return AlipayOpenMiniBaseinfoModifyResponse.class;
	}
	
	 public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
