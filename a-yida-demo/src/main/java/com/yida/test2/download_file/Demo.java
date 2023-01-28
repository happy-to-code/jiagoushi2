package com.yida.test2.download_file;

import com.yida.util.HttpUtil;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

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

        // for (int i = 0; i < 2; i++) {
        //     byte[] download = HttpUtil.download(client, url);
        //     System.out.println("download = " + download);
        //
        //     FileWriter writer = new FileWriter("E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test2\\download_file\\" + i + ".xlsx");
        //     writer.write(download, 0, download.length);
        // }


        byte[] download = HttpUtil.download(client, url);
        System.out.println("download = " + download);
        // InputStream inputStream = new ByteArrayInputStream(JSONUtil.toJsonStr(jsonObject).getBytes(StandardCharsets.UTF_8));
        InputStream inputStream = new ByteArrayInputStream(download);

        // ExcelReader reader = ExcelUtil.getReader(inputStream, 0);
        // System.out.println("reader = " + reader);
        // ExcelExtractor extractor = reader.getExtractor();
        // System.out.println("extractor = " + extractor);
        // String text = extractor.getText();
        // System.out.println("text = " + text);

        System.out.println("----------------------------------");
        try {
            String path = "E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test2\\download_file\\0.xlsx";

            // 创建工作簿对象
            // XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream(path));
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(inputStream);
            // xssfWorkbook.setWorkbookType(XSSFWorkbookType.XLSX);
            // 获取工作簿下sheet的个数
            int sheetNum = xssfWorkbook.getNumberOfSheets();
            System.out.println("该excel文件中总共有：" + sheetNum + "个sheet");
            // 遍历工作簿中的所有数据
            for (int i = 0; i < sheetNum; i++) {
                // 读取第i个工作表
                System.out.println("读取第" + (i + 1) + "个sheet");
                XSSFSheet sheet = xssfWorkbook.getSheetAt(i);
                // 获取最后一行的num，即总行数。此处从0开始
                int maxRow = sheet.getLastRowNum();
                for (int row = 0; row <= maxRow; row++) {
                    // 获取最后单元格num，即总单元格数 ***注意：此处从1开始计数***
                    int maxRol = sheet.getRow(row).getLastCellNum();
                    System.out.println("--------第" + row + "行的数据如下--------");
                    for (int rol = 0; rol < maxRol; rol++) {
                        System.out.print(sheet.getRow(row).getCell(rol) + "  ");
                    }
                    System.out.println();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        // String  path = "E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test2\\download_file\\0.xlsx";
        String path = "E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test2\\download_file\\盘库报告-1673426820088.csv";
        // ExcelReader reader2 = ExcelUtil.getReader(path, 0);
        // System.out.println("reader = " + reader2);
        // ExcelExtractor extractor2 = reader2.getExtractor();
        // String text2 = extractor2.getText();
        // System.out.println("text = " + text2);

        // ExcelReader reader3 = ExcelUtil.getReader(path,0);
        // List<Map<String,Object>> readAll = reader3.readAll();
        // System.out.println("readAll = " + readAll);

        readByCsvReader(path);
    }


    public static void readByCsvReader(String filePath) throws Exception {
        try (Reader reader = Files.newBufferedReader(Paths.get(filePath))) {
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(reader);
            for (CSVRecord record : records) {
                System.out.println("Record #: " + record.getRecordNumber());
                System.out.println("ID: " + record.get(0));
                System.out.println("Name: " + record.get(1));
                System.out.println("Email: " + record.get(2));
                System.out.println("Country: " + record.get(3));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
