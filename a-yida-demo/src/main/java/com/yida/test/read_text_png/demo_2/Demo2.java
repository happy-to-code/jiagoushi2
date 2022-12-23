package com.yida.test.read_text_png.demo_2;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * @Type: Demo2.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/23 15:45
 * @Version:
 */
public class Demo2 {
    public static String getPhotoContent(String imgPath) {
        try {
            double start = System.currentTimeMillis();
            // 获取字库的路径
            // String dataURL = new File(PhotoKnow.class.getResource("/").toURI()).getPath() + "\\tessdata";
            String dataURL = "E:\\mysoftware\\Tesseract-OCR\\tessdata";
            ITesseract instance = new Tesseract();
            // 设置字库的位置
            instance.setDatapath(dataURL);
            // 选择字库文件（只需要文件名，不需要后缀名）
            instance.setLanguage("eng");
            // 判断文件是否存在
            File imageFile = new File(imgPath);
            if (!imageFile.exists()) {
                return "文件不存在!";
            }
            // 将图片转换成流文件处理
            BufferedImage textImage = ImageIO.read(imageFile);
            String result = instance.doOCR(textImage);
            double end = System.currentTimeMillis();
            System.out.println("耗时" + (end - start) / 1000 + " s");
            return result;
        } catch (Exception e) {
            return "识别出错!";
        }
    }
    public static void main(String[] args) {
        System.out.println(getPhotoContent("E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\read_text_png\\demo_2\\img_1.png"));
    }
}
