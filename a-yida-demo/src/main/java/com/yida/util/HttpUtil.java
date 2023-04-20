package com.yida.util;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.util.CollectionUtils;

import java.io.InputStream;
import java.util.List;

/**
 * @ClassName HttpUtil
 * @Description TODO
 * @Author wujian
 * @Date 2020-02-14.sql 17:11
 */
public class HttpUtil {

    private static String CHARSET = "UTF-8";

    public static String post(CloseableHttpClient httpClient, String url, List<NameValuePair> formParam) throws Exception {
        return post(httpClient, url, null, formParam, null);
    }

    public static String post(CloseableHttpClient httpClient, String url, String bodyParam) throws Exception {
        return post(httpClient, url, bodyParam, null, null);
    }

    public static String post(CloseableHttpClient httpClient, String url, List<NameValuePair> formParam, Header... headers) throws Exception {
        return post(httpClient, url, null, formParam, headers);
    }

    public static String post(CloseableHttpClient httpClient, String url, String bodyParam, Header... headers) throws Exception {
        return post(httpClient, url, bodyParam, null, headers);
    }

    private static String post(CloseableHttpClient httpClient, String url, String bodyParam, List<NameValuePair> formParam, Header... headers) throws Exception {
        HttpPost httpPost = null;
        InputStream in = null;
        HttpEntity responseEntity = null;
        try {
            httpPost = handlePostPre(url, bodyParam, formParam, headers);
            HttpResponse response = httpClient.execute(httpPost);
            // 检查调用接口返回的状态码是否为200
            checkStatus(response);
            responseEntity = response.getEntity();
            if (responseEntity != null) {
                String content = EntityUtils.toString(responseEntity, CHARSET);
                in = response.getEntity().getContent();
                return content;
            }
        } finally {
            if (httpPost != null) {
                httpPost.abort();
            }
            if (responseEntity != null) {
                EntityUtils.consume(responseEntity);
            }
            IOUtils.closeQuietly(in);
        }
        return null;
    }

    public static String get(CloseableHttpClient httpClient, String url, List<NameValuePair> params) throws Exception {
        return get(httpClient, url, params, null);
    }

    private static String get(CloseableHttpClient httpClient, String url, List<NameValuePair> params, Header... headers) throws Exception {
        HttpGet httpGet = null;
        InputStream in = null;
        HttpEntity responseEntity = null;
        try {
            httpGet = handleGetPre(url, params, headers);
            HttpResponse response = httpClient.execute(httpGet);
            // 检查调用接口返回的状态码是否为200
            checkStatus(response);
            responseEntity = response.getEntity();
            String content = "";
            if (responseEntity != null) {
                content = EntityUtils.toString(responseEntity);
                in = response.getEntity().getContent();
            }
            return content;
        } finally {
            if (httpGet != null) {
                httpGet.abort();
            }
            if (responseEntity != null) {
                EntityUtils.consume(responseEntity);
            }
            IOUtils.closeQuietly(in);
        }
    }

    public static byte[] download(CloseableHttpClient httpClient, String downloadUrl) throws Exception {
        return download(httpClient, downloadUrl, null, null);
    }

    public static byte[] download(CloseableHttpClient httpClient, String downloadUrl, Header... headers) throws Exception {
        return download(httpClient, downloadUrl, null, headers);
    }

    public static byte[] download(CloseableHttpClient httpClient, String downloadUrl, List<NameValuePair> params) throws Exception {
        return download(httpClient, downloadUrl, params, null);
    }

    private static byte[] download(CloseableHttpClient httpClient, String url, List<NameValuePair> params, Header... headers) throws Exception {
        HttpGet httpGet = null;
        InputStream in = null;
        HttpEntity responseEntity = null;
        try {
            httpGet = handleGetPre(url, params, headers);
            HttpResponse response = httpClient.execute(httpGet);
            // 检查调用接口返回的状态码是否为200
            checkStatus(response);
            responseEntity = response.getEntity();
            byte[] data = null;
            if (responseEntity != null) {
                data = EntityUtils.toByteArray(responseEntity);
                in = response.getEntity().getContent();
            }
            checkStatus(response);
            return data;
        } finally {
            if (httpGet != null) {
                httpGet.abort();
            }
            if (responseEntity != null) {
                EntityUtils.consume(responseEntity);
            }
            IOUtils.closeQuietly(in);
        }
    }

    private static HttpGet handleGetPre(String url, List<NameValuePair> params, Header... headers) {
        try {
            HttpGet httpGet;
            if (!CollectionUtils.isEmpty(params)) {
                httpGet = new HttpGet(String.format("%s?%s", url, EntityUtils.toString(new UrlEncodedFormEntity(params, CHARSET))));
            } else {
                httpGet = new HttpGet(url);
            }
            // 处理请求header
            if (headers != null && headers.length > 0) {
                httpGet.setHeaders(headers);
            }
            return httpGet;
        } catch (Exception ex) {
            throw new RuntimeException("call http api error! UnsupportedCharsetException!");
        }
    }

    private static HttpPost handlePostPre(String url, String bodyParam, List<NameValuePair> formParam, Header... headers) {
        try {
            HttpPost httpPost = new HttpPost(url);
            // 处理表单参数
            if (!CollectionUtils.isEmpty(formParam)) {
                httpPost.setEntity(new UrlEncodedFormEntity(formParam, CHARSET));
            }
            // 处理body json参数
            if (StringUtils.isNotBlank(bodyParam)) {
                httpPost.setEntity(new StringEntity(bodyParam, CHARSET));
            }
            // 处理请求header
            if (headers != null && headers.length > 0) {
                httpPost.setHeaders(headers);
            }
            return httpPost;
        } catch (Exception ex) {
            throw new RuntimeException("call http api error! UnsupportedCharsetException!");
        }
    }

    /**
     * 判断调用结果的status
     *
     * @param response 响应数据信息
     */
    private static void checkStatus(HttpResponse response) {
        int statusCode = response.getStatusLine().getStatusCode();

        if (null == response || null == response.getStatusLine()) {
            throw new RuntimeException("请求返回体为空");
        }
        // status Code != 200
        if (200 != statusCode) {
            String errMsg = String.format("%s%s", "call http api error! status:", statusCode);
            throw new RuntimeException(errMsg);
        }
    }
}
