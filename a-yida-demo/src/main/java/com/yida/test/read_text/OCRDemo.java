package com.yida.test.read_text;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.net.URISyntaxException;

/**
 * java图像识别
 * likang 
 * 2018-7-13
 */
public class OCRDemo {
    public static void main(String[] args) throws TesseractException, URISyntaxException {
        String dataURL = new File(OCRDemo.class.getResource("/").toURI()).getPath() + "\\tessdata";
    
        ITesseract instance = new Tesseract();
        //如果未将tessdata放在根目录下需要指定绝对路径
        //设置训练库的位置
        // String dataURL = "C:\\myfile\\yida-jgs2\\a-yida-demo\\src\\main\\resources\\tessdata";
        instance.setDatapath(dataURL);

        //如果需要识别英文之外的语种，需要指定识别语种，并且需要将对应的语言包放进项目中
        // chi_sim ：简体中文， eng    根据需求选择语言库
        instance.setLanguage("chi_sim");

        // 指定识别图片
        // File imgDir = new File("E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\read_text\\test.png");
        File imgDir = new File("E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\read_text\\test003.pdf");
        long startTime = System.currentTimeMillis();
        String ocrResult = instance.doOCR(imgDir);

        String s = ocrResult.trim().replaceAll(" ", "").toLowerCase();
        // System.out.println("s = " + s);

        // 输出识别结果
        System.out.println("识别结果: \n" + s + "\n 耗时：" + (System.currentTimeMillis() - startTime) + "ms");
    }

}