package com.yida.test.runbai;

public class CreateApiOrder {
    // public static void main(String[] args) {
    //     String strParam = "{\"buyerid\":\"\",\"order_customerinvoicecode\":\"CDS1601140002\",\"product_id\":\"882\",\"trade_type\":\"ZYXT\",\"country\":\"US\",\"consignee_city\":\"Fountain Valley\",\"consignee_telephone\":\"14246340093\",\"consignee_name\":\"Martin Ventress\",\"consignee_postcode\":\"92708\",\"consignee_state\":\"California\",\"consignee_address\":\"10059 Quail Ct Fountain Valley California United States\",\"customer_id\":\"6581\",\"customer_userid\":\"6901\",\"orderInvoiceParam\":[{\"invoice_amount\":\"11.00\",\"sku\":\"Strap Buckle 表带  Isssss\",\"invoice_title\":\"Strap Buckle Issssss\",\"invoice_pcs\":\"1\",\"invoice_weight\":\"220\"}]}";
    //
    //     String strUrl = "http://localhost:8082/createOrderApi.htm";
    //     HttpClient objClient = new HttpClient();
    //     objClient.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
    //
    //     PostMethod objPostMethod = new PostMethod(strUrl);
    //
    //     try {
    //         strParam = URLEncoder.encode(strParam, "UTF-8");
    //     } catch (UnsupportedEncodingException e1) {
    //         e1.printStackTrace();
    //     }
    //     NameValuePair objNameValuePair = new NameValuePair();
    //     objNameValuePair.setName("param");
    //     objNameValuePair.setValue(strParam);
    //     objPostMethod.addParameter(objNameValuePair);
    //     try {
    //         int statusCode = objClient.executeMethod(objPostMethod);
    //
    //         String strResponseBody = new String(objPostMethod.getResponseBody());
    //         System.out.println("createOrder:statusCode~~~~~" + statusCode);
    //         System.out.println("createOrder:strResponseBody~~~~~" + strResponseBody);
    //     } catch (Exception e) {
    //
    //     }
    //
    //     try {
    //         System.out.println(URLDecoder.decode("%E7%89%B9%E6%AE%8A%E5%AD%97%E7%AC%A6%E6%97%A0%E6%B3%95%E8%A7%A3%E6%9E%90%21", "utf-8"));
    //     } catch (UnsupportedEncodingException e) {
    //         e.printStackTrace();
    //     }
    //
    // }
}