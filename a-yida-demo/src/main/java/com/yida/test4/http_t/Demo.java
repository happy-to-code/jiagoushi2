package com.yida.test4.http_t;

import lombok.extern.slf4j.Slf4j;
import okhttp3.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Slf4j
public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "您的“爱私基摩”X家用户身份已认证，请您通过“上海股权托管交易中心微信公众号->我要报价”登陆查看。【上海股权托管交易中心】";
        s = URLEncoder.encode(s, "UTF-8");
        System.out.println("s = " + s);

        String encodedString = new String(s.getBytes(), StandardCharsets.UTF_8);
        System.out.println("encodedString = " + encodedString);

        String url = "http://139.196.1.239/JianzhouSMSWSServer/http/sendBatchMessage";
        OkHttpClient client = new OkHttpClient();
        RequestBody requestBody = new FormBody.Builder()
                .add("account", "sdk_guquan")
                .add("password", "sdk_gqjy630")
                .add("msgText", s)
                .add("destmobile", "17625341118")
                .build();
        Request request = new Request.Builder()
                .addHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8;")
                .url(url)
                .post(requestBody)
                .build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println("call onFailure = " + call);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                System.out.println("call onResponse = " + response.body().string());
            }
        });


    }
}
