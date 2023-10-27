package com.example.spring2.method;
import okhttp3.*;

public class getInfo {
    public String main(String targetUrl, String method, String body) {
        OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
        Request request = new Request.Builder()
            .url(targetUrl)
            .method(method, body == null ? null : RequestBody.create(MediaType.parse("application/json"), body))
            .build();
        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (Exception e) {
            return "Error: " + e;
        }
    }

    private static final getInfo instance = new getInfo();
    public static getInfo getInstance() {
        return instance;
    }
}
