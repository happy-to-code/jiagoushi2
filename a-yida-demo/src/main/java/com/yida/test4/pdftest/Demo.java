package com.yida.test4.pdftest;

import cn.hutool.core.io.FileUtil;

import java.util.Base64;

/**
 * @author zhangyifei
 * @Date 2023/7/11 9:31
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        String filePath = "C:\\mydata\\project\\java_test\\jiagoushi\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test4\\pdftest\\file_temp\\Zhongsu_BP_PDF.txt";

        byte[] bytes = FileUtil.readBytes(filePath);


        byte[] bytes1 = Base64.getDecoder().decode(bytes);
        System.out.println("bytes1 = " + bytes1);

        String destPath = "C:\\mydata\\project\\java_test\\jiagoushi\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test4\\pdftest\\pdf\\Zhongsu.pdf";
        FileUtil.writeBytes(bytes1,destPath);
    }
}
