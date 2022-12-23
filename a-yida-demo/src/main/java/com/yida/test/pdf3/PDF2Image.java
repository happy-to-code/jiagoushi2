package com.yida.test.pdf3;

import com.spire.pdf.PdfDocument;
import com.spire.pdf.PdfPageBase;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class PDF2Image {
    public static void main(String[] args) throws Exception { // 加载测试文档
        long start = System.currentTimeMillis();
        // 加载测试文档
        PdfDocument pdf = new PdfDocument();
        pdf.loadFromFile("E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\pdf3\\11.29THD批量 美东.pdf");

        // 定义一个int型变量
        int index = 0;

        // 遍历PDF每一页
        for (int i = 0; i < pdf.getPages().getCount(); i++) {
            // 获取PDF页面
            PdfPageBase page = pdf.getPages().get(i);

            // 使用extractImages方法获取页面上图片
            for (BufferedImage image : page.extractImages()) {
                // 指定输出图片名称
                File output = new File(String.format("Image_%d.png", index++));
                // 将图片保存为PNG格式文件
                ImageIO.write(image, "PNG", output);
            }
        }
        long end = System.currentTimeMillis();

        // 28226
        System.out.println("总耗时：" + (end - start));
    }


}
