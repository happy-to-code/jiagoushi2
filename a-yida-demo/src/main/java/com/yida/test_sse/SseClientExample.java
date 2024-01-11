package com.yida.test_sse;

import okhttp3.*;
import okhttp3.internal.sse.RealEventSource;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;

public class SseClientExample {

    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create(JSON, "{\n" +
                "    \"prompt\": [\n" +
                "        {\n" +
                "            \"role\": \"user\",\n" +
                "            \"content\": \"liucixin\"\n" +
                "        }\n" +
                "    ]\n" +
                "}");

        Request request = new Request.Builder()
                .url("https://open.bigmodel.cn/api/paas/v3/model-api/chatglm_turbo/sse-invoke")
                .addHeader("Authorization", "eyJhbGciOiJIUzI1NiIsInNpZ25fdHlwZSI6IlNJR04ifQ.eyJhcGlfa2V5IjoiMmFkNzMxYTUxZTVkNzhkNzFhNzVkYjBhZTBiMDI1NjQiLCJleHAiOjE3MzI1MDM4MjkxMzAsInRpbWVzdGFtcCI6MTcwNDM1MjMwNTcyM30.jEyJVfrhPSDF_8BZLeMBVweVCB30LbTDa6cVQo-1Z9U")
                .post(body)
                .build();

        EventSourceListener listener = new EventSourceListener() {
            @Override
            public void onEvent(EventSource eventSource, String id, String type, String data) {
                System.out.println("Received SSE event:");
                System.out.println("ID: " + id);
                System.out.println("Type: " + type);
                System.out.println("Data: " + data);
            }

            @Override
            public void onFailure(EventSource eventSource, Throwable t, Response response) {
                t.printStackTrace();
            }
        };

        // EventSource eventSource = EventSource.Factory(client)
        //         .newEventSource(request, listener);
        RealEventSource realEventSource = new RealEventSource(request,listener);
        realEventSource.connect(client);


        // 可以在需要时关闭EventSource
        // eventSource.close();
    }
}
