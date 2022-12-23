package com.yida.test.read_text_png.demo_4;

import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;


/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/23 16:16
 * @Version:
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        BufferedImage image = (BufferedImage) ImgUtil.rotate(ImageIO.read(FileUtil.file("")), 90);
        // ImgUtil.write(image, FileUtil.file("e:/pic/result.png"));
    }
}
