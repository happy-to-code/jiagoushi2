package com.yida.test.read_text_png.demo_1;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/23 15:15
 * @Version:
 */
public class Test {
    public static void main(String[] args) throws TesseractException {
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("E:/mysoftware/Tesseract-OCR/tessdata");
        System.out.println(tesseract.doOCR(new File("E:\\java_demo\\jiagoushi2\\Image_0.png")));

    }
}
