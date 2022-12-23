package com.yida.test.read_text_png.demo_4;

import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/23 16:16
 * @Version:
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        String imagePath = "E:\\java_demo\\jiagoushi2\\Image_1.png";
        String storePath = "E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\read_text_png\\demo_4\\image\\";

        // 旋转90度
        Image image = ImgUtil.rotate(ImageIO.read(FileUtil.file(imagePath)), 90);
        ImgUtil.write(image, FileUtil.file(storePath + "new.png"));

        // cut 剪裁图片
        ImgUtil.cut(
                FileUtil.file(storePath + "new.png"),
                FileUtil.file(storePath + "face_result.jpg"),
                new Rectangle(173 ,710, 320,40 ) // 裁剪的矩形区域
        );
        ImgUtil.cut(
                FileUtil.file(storePath + "new.png"),
                FileUtil.file(storePath + "face_result2.jpg"),
                new Rectangle(154 ,1143, 108,22 ) // 裁剪的矩形区域
        );

        String photoContent = getPhotoContent(storePath + "face_result.jpg");
        System.out.println("photoContent = " + photoContent);
        String photoContent1 = getPhotoContent(storePath + "face_result2.jpg");
        System.out.println("photoContent1 = " + photoContent1);

    }

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
}
