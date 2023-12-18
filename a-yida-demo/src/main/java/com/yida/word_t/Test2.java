package com.yida.word_t;

import org.apache.poi.xwpf.usermodel.BodyType;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * @author zhangyifei
 * @Date 2023/11/6 15:37
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        XWPFDocument doc = new XWPFDocument(new FileInputStream("C:\\mydata\\temp\\123.docx"));
        List<XWPFParagraph> paragraphs = doc.getParagraphs();
        XWPFParagraph xwpfParagraph = paragraphs.get(0);
        System.out.println("xwpfParagraph = " + xwpfParagraph);
        BodyType partType = xwpfParagraph.getPartType();
        System.out.println("partType = " + partType);



    }
}
