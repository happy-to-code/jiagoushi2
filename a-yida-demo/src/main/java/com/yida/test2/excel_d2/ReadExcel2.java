// package com.yida.test2.excel_d2;
//
// import org.apache.poi.xssf.usermodel.XSSFCell;
// import org.apache.poi.xssf.usermodel.XSSFRow;
// import org.apache.poi.xssf.usermodel.XSSFSheet;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
// import java.io.FileInputStream;
// import java.io.IOException;
//
// public class ReadExcel2 {
//     public static void main(String[] args) {
//         try {
//             String  path = "E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test2\\excel_d2\\SP广告产品报告2023-01-08_2023-01-09-20230110170256120.xlsx";
//
//             // 创建工作簿对象
//             XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream(path));
//             // 获取工作簿下sheet的个数
//             int sheetNum = xssfWorkbook.getNumberOfSheets();
//             System.out.println("该excel文件中总共有：" + sheetNum + "个sheet");
//             // 遍历工作簿中的所有数据
//             for (int i = 0; i < sheetNum; i++) {
//                 // 读取第i个工作表
//                 System.out.println("读取第" + (i + 1) + "个sheet");
//                 XSSFSheet sheet = xssfWorkbook.getSheetAt(i);
//                 // 获取最后一行的num，即总行数。此处从0开始
//                 int maxRow = sheet.getLastRowNum();
//                 for (int row = 0; row <= maxRow; row++) {
//                     // 获取最后单元格num，即总单元格数 ***注意：此处从1开始计数***
//                     int maxRol = sheet.getRow(row).getLastCellNum();
//                     System.out.println("--------第" + row + "行的数据如下--------");
//                     for (int rol = 0; rol < maxRol; rol++) {
//                         // System.out.print(sheet.getRow(row).getCell(rol) + "|------|");
//                         XSSFRow row1 = sheet.getRow(row);
//                         XSSFCell cell = row1.getCell(rol);
//                         System.out.println("cell = " + cell);
//                     }
//                     System.out.println();
//                 }
//             }
//
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//
//     }
// }
