package com.yida.test2.json_util_d2;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONUtil;
import com.yida.util.JsonUtils;

import java.util.List;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/12 9:12
 * @Version:
 */
public class Demo1 {
    public static void main(String[] args) {
        String s = "{\"code\":0,\"msg\":\"success\",\"data\":{\"pageNo\":1,\"pageSize\":20,\"totalPage\":1,\"totalSize\":7,\"rows\":[{\"amzReportId\":\"831045155\",\"title\":\"盘库报告\",\"shopName\":\"sakerInc本土US-17-CA\",\"reportType\":\"returns\",\"reportTimeRangeStr\":\"2022-10-31 12:00~2022-11-30 23:59\",\"createTimeStr\":\"2023-01-11 16:37\",\"createName\":\"15301577520\",\"completedDateStr\":\"2023-01-11 08:37\",\"state\":\"success\",\"remark\":\"\",\"dwFlag\":\"1\",\"downloadUrls\":[\"https://sellfox-private-1251220924.cos.ap-guangzhou.myqcloud.com/sellfox-private/reportCenterFile/23071/59046/A2EUQ1WTGCTBG2/%E7%9B%98%E5%BA%93%E6%8A%A5%E5%91%8A-1673426820088.csv?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKID5sN5poD8sq7iAhdAT5dRvSmJydTjoCrc%26q-sign-time%3D1673606557%3B1673610157%26q-key-time%3D1673606557%3B1673610157%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3Ddedee60792edf57dd62b2c85495ba8e0b1f727e8\"],\"errorMsg\":null},{\"amzReportId\":\"831045038\",\"title\":\"英斯柏EU-01-DE44\",\"shopName\":\"英斯柏NA-01-US\",\"reportType\":\"returns\",\"reportTimeRangeStr\":\"2022-10-31 12:00~2022-11-30 23:59\",\"createTimeStr\":\"2023-01-11 16:32\",\"createName\":\"15301577520\",\"completedDateStr\":\"2023-01-11 08:32\",\"state\":\"success\",\"remark\":\"\",\"dwFlag\":\"1\",\"downloadUrls\":[\"https://sellfox-private-1251220924.cos.ap-guangzhou.myqcloud.com/sellfox-private/reportCenterFile/23071/57642/ATVPDKIKX0DER/%E8%8B%B1%E6%96%AF%E6%9F%8FEU-01-DE44-1673426651499.csv?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKID5sN5poD8sq7iAhdAT5dRvSmJydTjoCrc%26q-sign-time%3D1673606557%3B1673610157%26q-key-time%3D1673606557%3B1673610157%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3D86f038959720e019af338803ebfeddb6621b2eee\"],\"errorMsg\":null},{\"amzReportId\":\"831040133\",\"title\":\"盘库报告\",\"shopName\":\"sakerInc本土US-17-CA\",\"reportType\":\"inventory\",\"reportTimeRangeStr\":\"2022-10-31 12:00~2022-11-30 23:59\",\"createTimeStr\":\"2023-01-11 16:29\",\"createName\":\"15301577520\",\"completedDateStr\":\"2023-01-11 08:29\",\"state\":\"success\",\"remark\":\"\",\"dwFlag\":\"1\",\"downloadUrls\":[\"https://sellfox-private-1251220924.cos.ap-guangzhou.myqcloud.com/sellfox-private/reportCenterFile/23071/59046/A2EUQ1WTGCTBG2/%E7%9B%98%E5%BA%93%E6%8A%A5%E5%91%8A-1673426527327.csv?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKID5sN5poD8sq7iAhdAT5dRvSmJydTjoCrc%26q-sign-time%3D1673606557%3B1673610157%26q-key-time%3D1673606557%3B1673610157%26q-header-list%3D%26q-url-param-list%3D%26q-signature%3D17525a69cde0a12507def548a30ae67d0cad3e14\"],\"errorMsg\":null},{\"amzReportId\":\"831040055\",\"title\":\"盘库报告\",\"shopName\":\"sakerInc本土US-17-CA\",\"reportType\":\"inventory\",\"reportTimeRangeStr\":\"2022-10-31 12:00~2022-10-31 23:59\",\"createTimeStr\":\"2023-01-11 16:27\",\"createName\":\"15301577520\",\"completedDateStr\":\"\",\"state\":\"fail\",\"remark\":\"亚马逊取消报告\",\"dwFlag\":\"0\",\"downloadUrls\":null,\"errorMsg\":null},{\"amzReportId\":\"831039600\",\"title\":\"盘库报告\",\"shopName\":\"sakerInc本土US-17-CA\",\"reportType\":\"inventory\",\"reportTimeRangeStr\":\"2023-01-10 12:00~2023-01-10 23:59\",\"createTimeStr\":\"2023-01-11 16:26\",\"createName\":\"15301577520\",\"completedDateStr\":\"\",\"state\":\"fail\",\"remark\":\"请求亚马逊报表失败\",\"dwFlag\":\"0\",\"downloadUrls\":null,\"errorMsg\":null},{\"amzReportId\":\"831039091\",\"title\":\"盘库报告\",\"shopName\":\"sakerInc本土US-17-CA\",\"reportType\":\"inventory\",\"reportTimeRangeStr\":\"2023-01-10 12:00~2023-01-10 23:59\",\"createTimeStr\":\"2023-01-11 16:20\",\"createName\":\"15301577520\",\"completedDateStr\":\"\",\"state\":\"fail\",\"remark\":\"请求亚马逊报表失败\",\"dwFlag\":\"0\",\"downloadUrls\":null,\"errorMsg\":null},{\"amzReportId\":\"830957168\",\"title\":\"盘库报告\",\"shopName\":\"sakerInc本土US-17-CA\",\"reportType\":\"inventory\",\"reportTimeRangeStr\":\"2023-01-10 12:00~2023-01-10 23:59\",\"createTimeStr\":\"2023-01-11 16:08\",\"createName\":\"15301577520\",\"completedDateStr\":\"\",\"state\":\"fail\",\"remark\":\"亚马逊取消报告\",\"dwFlag\":\"0\",\"downloadUrls\":null,\"errorMsg\":null}]},\"requestId\":\"a13d85ff-2fb7-49c1-beb1-5b1e01289c44\"}";


        List list = JsonUtils.getValue(s, "data.rows", List.class);
        System.out.println("list = " + list);
        for (Object o : list) {
            // String amzReportId = JsonUtils.getValue(JSONUtil.toJsonStr(o), "amzReportId", String.class);
            // System.out.println("amzReportId = " + amzReportId);

            List downloadUrls = JsonUtils.getValue(JSONUtil.toJsonStr(o), "downloadUrls", List.class);
            if (CollUtil.isNotEmpty(downloadUrls)) {
                for (Object downloadUrl : downloadUrls) {
                    System.out.println("downloadUrl = " + downloadUrl);
                }
            }

        }


    }
}
