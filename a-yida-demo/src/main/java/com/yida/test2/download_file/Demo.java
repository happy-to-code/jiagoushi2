package com.yida.test2.download_file;

import cn.hutool.core.io.file.FileWriter;
import com.yida.util.HttpUtil;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2023/1/15 10:32
 * @Version:
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        String url = "https://cos.ap-guangzhou.myqcloud.com/sellfox-public-1251220924/temp/20230110/excelExport/23071/0/2fa27a45224e1a7c1816c3f2bcbb54bd/SB广告活动报告2023-01-08~2023-01-09-20230110170256441.xlsx";
        CloseableHttpClient client = HttpClients.createDefault();

        for (int i = 0; i < 2; i++) {
            byte[] download = HttpUtil.download(client, url);
            System.out.println("download = " + download);

            FileWriter writer = new FileWriter("E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test2\\download_file\\" + i + ".xlsx");
            writer.write(download, 0, download.length);
        }
    }
}
