package com.yida.test3.test9;

import cn.hutool.http.HttpUtil;

/**
 * @Auther: yida
 * @Date: 2023/5/26 17:23
 * @Description:
 */
public class Demo {
	public static void main(String[] args) {
		String url = "http://139.196.1.239/JianzhouSMSWSServer/http/sendBatchMessage?account=sdk_guquan&password=sdk_gqjy630&msgText=【上海股权托管交易中心】您的爱私基摩X家用户身份已认证，请您通过上海股权托管交易中心微信公众号->我要报价登陆查看&destmobile=17625341118";
		String post = HttpUtil.post(url, "");
		System.out.println("post = " + post);
		
		
	}
}
