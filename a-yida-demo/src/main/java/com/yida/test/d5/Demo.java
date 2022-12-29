package com.yida.test.d5;

import cn.hutool.core.util.StrUtil;

import java.io.File;
import java.util.UUID;

/**
 * @Type: Demo.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/12/26 9:54
 * @Version:
 */
public class Demo {
    public static void main(String[] args) {
        String file = ClassLoader.getSystemResource("").getFile();
        System.out.println("file = " + file);


        String file1 = Thread.currentThread().getContextClassLoader().getResource("").getFile();
        System.out.println("file1 = " + file1);

        String s = System.getProperty("user.dir") + File.separator;
        System.out.println("s = " + s);
        System.out.println("=================================");
        File file2 = new File("./image2/");

        // // 如果文件夹不存在则创建
        // if (!file2.exists() && !file2.isDirectory()) {
        //     System.out.println("//不存在");
        //     file2.mkdir();
        // } else {
        //     System.out.println("//目录存在");
        // }

        // remove(file2);


        String ss = "/E:/java_demo/jiagoushi2/a-yida-demo/target/classes/" + UUID.randomUUID().toString() + "_test.png";
        System.out.println("ss = " + ss);
        String[] split = ss.split("/");
        // for (String s1 : split) {
        //     System.out.println("s1 = " + s1);
        // }
        int length = split.length;
        String s2 = split[length - 1];
        System.out.println("s2 = " + s2);

        String s3 = s2.substring(0, s2.lastIndexOf(".png"));
        System.out.println("s3 = " + s3);


        String sss = "D:\\a_work\\source\\sak-boot-parent\\image\\25cad66d-1fc6-40f3-b385-fb5dcc30ea2e.png";
        String picName = getPicName(sss);
        System.out.println("picName = " + picName);
    }

    private static String getPicName(String fileName) {
        if (StrUtil.isNotBlank(fileName)) {
            String[] split = fileName.split("\\\\");
            int length = split.length;
            if (length < 1) {
                return UUID.randomUUID().toString();
            }
            String picFullName = split[length - 1];
            return picFullName.substring(0, picFullName.lastIndexOf(".png"));
        }
        return UUID.randomUUID().toString();
    }

    public static void remove(File file) {
        File[] files = file.listFiles();// 将file子目录及子文件放进文件数组
        if (files != null) {// 如果包含文件进行删除操作
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {// 删除子文件
                    files[i].delete();
                } else if (files[i].isDirectory()) {// 通过递归方法删除子目录的文件
                    remove(files[i]);
                }
                files[i].delete();// 删除子目录
            }
        }
    }


}
