package com.yida.test.read_text_png.demo_1;

import net.sourceforge.tess4j.TesseractException;

import java.io.IOException;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/23 15:15
 * @Version:
 */
public class Test {
    public static void main(String[] args) throws TesseractException, IOException {
        // String path = "C:\\myfile\\yida-jgs2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\read_text_png\\demo_1\\img.png";
        // String path = "C:\\myfile\\yida-jgs2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\read_text_png\\demo_1\\img_1.png";
        //
        // Tesseract tesseract = new Tesseract();
        // tesseract.setDatapath("C:\\myfile\\yida-jgs2\\a-yida-demo\\src\\main\\resources\\tessdata");
        // System.out.println(tesseract.doOCR(new File(path)));


        // String path22 = new Test().getClass().getClassLoader().getResource("").getPath();
        // System.out.println(path22);

        Test t = new Test();
        t.function1("");
    }

    public void function1(String fileName) throws IOException {
        String path = this.getClass().getClassLoader().getResource("").getPath();
        System.out.println("path = " + path);
    }
}
