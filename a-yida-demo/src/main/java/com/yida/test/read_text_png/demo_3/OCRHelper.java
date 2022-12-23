package com.yida.test.read_text_png.demo_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class OCRHelper {

    /**
     * @param imageFile 传入的图像文件
     * @param flag      是否识别中文
     * @return 识别后的字符串
     */
    public String recognizeByOne(File imageFile, Boolean flag) throws Exception {

        // 将识别出的内容保存在txt临时文本中,目录与图片在同一级,读取万临时文件内容后会删除该文件
        File tempFile = new File(imageFile.getParentFile(), "temp");
        StringBuffer result = new StringBuffer(); // 接收识别结果

        // cmd 输出格式[C:\Program Files (x86)\Tesseract-OCR\tesseract, 1.png,
        // output,-l, chi_sim]
        List<String> cmd = new ArrayList<String>();
        // 注意: C:\\Program Files (x86)\\Tesseract-OCR是你的tesseract-OCR的安装目录
        // 我这里是默认安装目录
        cmd.add("E:\\mysoftware\\Tesseract-OCR\\tessdata");
        cmd.add("");
        cmd.add(tempFile.getName()); // 指定识别出内容保存位置
        cmd.add("-l"); // 语言参数标志 注意 :这里是字母l 不是数字1
        if (flag) { // 设置语言库 中文 chi_sim 英文 eng
            cmd.add("chi_sim");
        } else {
            cmd.add("eng");
        }

        // ProcessBuilder类是J2SE 1.5在java.lang中新添加的一个新类，
        // 此类用于创建操作系统进程，它提供一种启动和管理进程（也就是应用程序）的方法。
        // 也可用 Runtime.getRuntime().exec("tesseract.exe 1.jpg 1 -l chi_sim"); 执行
        ProcessBuilder pb = new ProcessBuilder();
        pb.directory(imageFile.getParentFile()); // 设置进程工作目录
        cmd.set(1, imageFile.getName());
        pb.command(cmd);
        pb.redirectErrorStream(true);

        Process process = pb.start();
        int w = process.waitFor(); // 进程等待
        if (w == 0)// 0代表正常退出

        {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(new FileInputStream(tempFile.getAbsolutePath() + ".txt"), "UTF-8"));
            String str;

            while ((str = in.readLine()) != null) { // 读取识别结果
                result.append(str + "\n"); // 这里每读取一行需要添加换行符
                // （否则识别出的结果在用记事本打开不会换行，但是用notepad会看见换行）
            }
            in.close();
        } else {
            String msg;
            switch (w) {
                case 1:
                    msg = "Errors accessing files. There may be spaces in your image's filename.";
                    break;
                case 29:
                    msg = "Cannot recognize the image or its selected region.";
                    break;
                case 31:
                    msg = "Unsupported image format.";
                    break;
                default:
                    msg = "Errors occurred.";
            }
            throw new RuntimeException(msg);
        }
        new File(tempFile.getAbsolutePath() + ".txt").delete(); // 删除临时生成的txt文件
        return result.toString();
    }

    public static void main(String[] args) {
        // 单张图片识别方法
        File file = new File("E:\\java_demo\\jiagoushi2\\Image_0.png");
        try {
            System.out.println(new OCRHelper().recognizeByOne(file, false));// 英文识别 false 中文识别 true
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
