package com.yida.test.pdfbox;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.FileInputStream;
import java.io.IOException;

public class LoadPDF {

    public static void main(String[] args) throws  IOException {
        long startTime = System.currentTimeMillis();
        //通过文件和输入流都可以加载pdf文件
        // PDDocument doc = PDDocument.load(new FileInputStream("E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\pdfbox\\test003.pdf"));
        PDDocument doc = PDDocument.load(new FileInputStream("E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\pdfbox\\1670981634811-2022NovMonthlySummary.pdf"));

        PDFTextStripper text = new PDFTextStripper();
        //获取全文件的所有文本
        String FinalText = text.getText(doc);
        long endTime = System.currentTimeMillis();
        System.out.println("(endTime-startTime) = " + (endTime-startTime));
        System.out.println(FinalText);
        //关闭
        doc.close();
    }

}
