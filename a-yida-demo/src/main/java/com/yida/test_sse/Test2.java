package com.yida.test_sse;

import okhttp3.*;

import java.io.IOException;

/**
 * @author zhangyifei
 * @Date 2024/1/4 16:02
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        String postBody = "{\"prompt\":[{\"role\":\"user\",\"content\":\"liucixin\"}]}";

        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        String token = "eyJhbGciOiJIUzI1NiIsInNpZ25fdHlwZSI6IlNJR04ifQ.eyJhcGlfa2V5IjoiMmFkNzMxYTUxZTVkNzhkNzFhNzVkYjBhZTBiMDI1NjQiLCJleHAiOjE3MzI1MDM4MjkxMzAsInRpbWVzdGFtcCI6MTcwNDM1MjMwNTcyM30.jEyJVfrhPSDF_8BZLeMBVweVCB30LbTDa6cVQo-1Z9U";

        String url = "https://open.bigmodel.cn/api/paas/v3/model-api/chatglm_turbo/sse-invoke";
        Request request = new Request.Builder()
                .url(url)
                .addHeader("Authorization", Credentials.basic("Authorization", token))
                .addHeader("Content-Type", "text/event-stream;charset=UTF-8")
                .post(RequestBody.create(JSON, postBody))
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();
        System.out.println("response = " + response);
    }
}
