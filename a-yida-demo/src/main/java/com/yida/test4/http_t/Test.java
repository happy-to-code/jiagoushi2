package com.yida.test4.http_t;

import cn.hutool.core.io.IoUtil;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;


public class Test {

//    public static final String POST_URL = "https://www.jianzhou.sh.cn/JianzhouSMSWSServer/http/sendBatchMessage";
    public static final String POST_URL = "http://139.196.1.239/JianzhouSMSWSServer/http/sendBatchMessage";

    public static void readContentFromPost() throws IOException {
        String s = "您的“爱私基摩”yida用户身份已认证，请您通过“上海股权托管交易中心微信公众号->我要报价”登陆查看。【上海股权托管交易中心】";

        // Post请求的url，与get不同的是不需要带参数
        URL postUrl = new URL(POST_URL);
        // 打开连接
        HttpURLConnection connection = (HttpURLConnection) postUrl.openConnection();
        // Output to the connection. Default is
        // false, set to true because post
        // method must write something to the
        // connection
        // 设置是否向connection输出，因为这个是post请求，参数要放在
        // http正文内，因此需要设为true
        connection.setDoOutput(true);
        // Read from the connection. Default is true.
        connection.setDoInput(true);
        // Set the post method. Default is GET
        connection.setRequestMethod("POST");
        // Post cannot use caches
        // Post 请求不能使用缓存
        connection.setUseCaches(false);
        // This method takes effects to
        // every instances of this class.
        // URLConnection.setFollowRedirects是static函数，作用于所有的URLConnection对象。
        // connection.setFollowRedirects(true);

        // This methods only
        // takes effacts to this
        // instance.
        // URLConnection.setInstanceFollowRedirects是成员函数，仅作用于当前函数
        connection.setInstanceFollowRedirects(true);
        // Set the content type to urlencoded,
        // because we will write
        // some URL-encoded content to the
        // connection. Settings above must be set before connect!
        // 配置本次连接的Content-type，配置为application/x-www-form-urlencoded的
        // 意思是正文是urlencoded编码过的form参数，下面我们可以看到我们对正文内容使用URLEncoder.encode
        // 进行编码
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        // 连接，从postUrl.openConnection()至此的配置必须要在connect之前完成，
        // 要注意的是connection.getOutputStream会隐含的进行connect。
        connection.connect();
        DataOutputStream out = new DataOutputStream(connection.getOutputStream());
        // The URL-encoded contend

        //下面为http发送短信模式--------
        String content = "account=" + "sdk_guquan" + "&" + "password=" + "sdk_gqjy630" + "&" + "sendDateTime=" + "" + "&" + "destmobile=" + "17625341118" + "&" + "msgText=" + URLEncoder.encode(s, "UTF-8");

        out.writeBytes(content);

        out.flush();
        out.close(); // flush and close
//        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//        String line;
//        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
//        }


        String resp = IoUtil.read(connection.getInputStream(), Charset.forName("UTF-8"));
        System.out.println("resp = " + resp);

//        reader.close();
        connection.disconnect();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            readContentFromPost();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}