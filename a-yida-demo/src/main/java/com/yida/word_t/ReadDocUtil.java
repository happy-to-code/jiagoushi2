package com.yida.word_t;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDocUtil {


    // main方法测试
    public static void main(String[] args) throws IOException {
        // 测试文件
        String filename = "C:\\mydata\\temp\\123.docx";
        FileInputStream fis = new FileInputStream(new File(filename));
        XWPFDocument doc = new XWPFDocument(fis);

        XWPFWordExtractor extractor = new XWPFWordExtractor(doc);
        String doc1 = extractor.getText();
        System.out.println(doc1);
        fis.close();
    }
}
