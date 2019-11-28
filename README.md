[![Codacy Badge](https://api.codacy.com/project/badge/Grade/5a2a4867c87d4d15a8beba06d2e49635)](https://www.codacy.com/manual/antopen/alipay-sdk-java-all?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=alipay/alipay-sdk-java-all&amp;utm_campaign=Badge_Grade)
[![Build Status](https://www.travis-ci.org/alipay/alipay-sdk-java-all.svg?branch=dev)](https://www.travis-ci.org/alipay/alipay-sdk-java-all)

欢迎使用 Alipay SDK for Java 。

Alipay SDK for Java让您不用复杂编程即可访支付宝开放平台开放的各项能力，SDK可以自动帮您满足能力调用过程中所需的证书校验、加签、验签、发送HTTP请求等非功能性要求。

这里向您介绍如何获取 Alipay SDK for Java 并开始调用。
如果您在使用 Alipay SDK for Java 的过程中遇到任何问题，欢迎在当前 GitHub [提交 Issues](https://github.com/alipay/alipay-sdk-java-all/issues/new)。

## 环境要求
1. 使用 Alipay SDK for Java 之前 ，您需要先前往[支付宝开发平台-开发者中心](https://openhome.alipay.com/platform/developerIndex.htm)完成开发者接入的一些准备工作，包括创建应用、为应用添加功能包、设置应用的接口加签方式等。

2. 在设置应用的接口加签方式时，会涉及公私钥对的生成，欢迎下载
[支付宝开发助手（Mac版）](https://ideservice.alipay.com/ide/getPluginUrl.htm?clientType=assistant&platform=mac&channelType=WEB)
或
[支付宝开发助手（Windows版，注意安装路径中不能有空格）](https://ideservice.alipay.com/ide/getPluginUrl.htm?clientType=assistant&platform=win&channelType=WEB)
进行公私钥对的生成。

3. 准备工作完成后，注意保存如下参数，后续将作为使用SDK的输入。
	* 加签模式为公钥证书模式时（推荐）
	`AppID`、`应用的私钥`、`应用的公钥证书文件`、`支付宝公钥证书文件`、`支付宝根证书文件`
	* 加签模式为公钥模式时
	`AppId`、`应用的私钥`、`应用的公钥`、`支付宝公钥`

4. Alipay SDK for Java 需要配合`JKD 1.6`或其以上版本。

## 安装依赖
通过Maven来管理项目依赖（推荐），您只需在项目的`pom.xml`文件中声明如下依赖
```xml
<dependency>
    <groupId>com.alipay.sdk</groupId>
    <artifactId>alipay-sdk-java</artifactId>
    <version>4.8.62.ALL</version>
</dependency>
```

## 快速使用
以下这段代码示例向您展示了使用Alipay SDK for Java调用一个API的3个主要步骤：
1. 创建DefaultAlipayClient实例并初始化。
2. 创建API请求对象并设置Model参数。
3. 发起请求并处理响应或异常。

```java
import com.alipay.api.AlipayClient;
import com.alipay.api.CertAlipayRequest;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayOpenOperationOpenbizmockBizQueryModel;
import com.alipay.api.request.AlipayOpenOperationOpenbizmockBizQueryRequest;
import com.alipay.api.response.AlipayOpenOperationOpenbizmockBizQueryResponse;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. 创建AlipayClient实例
            AlipayClient alipayClient = new DefaultAlipayClient(getClientParams());
            // 2. 创建使用的Open API对应的Request请求对象
            AlipayOpenOperationOpenbizmockBizQueryRequest request = getRequest();
            // 3. 发起请求并处理响应
            AlipayOpenOperationOpenbizmockBizQueryResponse response = alipayClient.certificateExecute(request);
            if (response.isSuccess()) {
                System.out.println("调用成功。");
            } else {
                System.out.println("调用失败，原因：" + response.getMsg() + "，" + response.getSubMsg());
            }
        } catch (Exception e) {
            System.out.println("调用遭遇异常，原因：" + e.getMessage());
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    private static CertAlipayRequest getClientParams() {
        CertAlipayRequest certParams = new CertAlipayRequest();
        certParams.setServerUrl("https://openapi.alipay.com/gateway.do");
        certParams.setAppId("2019091767145019"); //请更换为您的AppId
        certParams.setPrivateKey("MIIEvQIBADANB ... ..."); //请更换为您的PKCS8格式的应用私钥
        certParams.setCharset("utf-8"); //请更换为您使用的字符集编码，推荐采用utf-8
        certParams.setFormat("json");
        certParams.setSignType("RSA2");
        certParams.setCertPath("/home/foo/appCertPublicKey_2019091767145019.crt"); //请更换为您的应用公钥证书文件路径
        certParams.setAlipayPublicCertPath("/home/foo/alipayCertPublicKey_RSA2.crt"); //请更换您的支付宝公钥证书文件路径
        certParams.setRootCertPath("/home/foo/alipayRootCert.crt"); //更换为支付宝根证书文件路径
        return certParams;
    }

    private static AlipayOpenOperationOpenbizmockBizQueryRequest getRequest() {
        // 初始化Request，并填充Model属性。实际调用时请替换为您想要使用的API对应的Request对象。
        AlipayOpenOperationOpenbizmockBizQueryRequest request = new AlipayOpenOperationOpenbizmockBizQueryRequest();
        AlipayOpenOperationOpenbizmockBizQueryModel model = new AlipayOpenOperationOpenbizmockBizQueryModel();
        model.setBizNo("test");
        request.setBizModel(model);
        return request;
    }
}
```

## 许可证
[Apache-2.0](http://www.apache.org/licenses/LICENSE-2.0)
