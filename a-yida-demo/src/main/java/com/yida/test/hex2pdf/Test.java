package com.yida.test.hex2pdf;

import cn.hutool.core.util.HexUtil;

import java.io.*;
import java.util.Base64;

/**
 * @Type: Test.java
 * @Desc:
 * @author: zhangyifei
 * @Date: 2022/11/15 16:34
 * @Version:
 */
public class Test {

    public static void main1(String[] args) throws Exception {
        String s = LoadContentByPath("E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\hex2pdf\\1.sql");
        // byte[] b = hexStringToBytes(s);
        byte[] b = HexUtil.decodeHex(s);

        buff2Image(b, "E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\hex2pdf\\test4.pdf");


    }
    public static void main2(String[] args) throws Exception {
        String s = LoadContentByPath("E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\hex2pdf\\3.txt");
        // byte[] b = hexStringToBytes(s);
        // byte[] b = HexUtil.decodeHex(s);
        byte[] b = Base64.getDecoder().decode(s);

        buff2Image(b, "E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\hex2pdf\\test5.pdf");
    }
    public static void main3(String[] args) throws Exception {
        // String s = LoadContentByPath("C:\\Users\\Administrator\\Desktop\\temp\\9.pdf");
        // System.out.println("s = " + s);
        // FileUtil.writeUtf8String(s,new File("E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\hex2pdf\\7.pdf"));

        //图片转化为二进制
        byte[] imageBytes = null;
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\temp\\9.pdf")) {
            imageBytes = new byte[fileInputStream.available()];
            fileInputStream.read(imageBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(imageBytes);

        //二进制转化为图片
        try (FileOutputStream fileOutputStream =
                     new FileOutputStream("E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\hex2pdf\\8.pdf");) {
            fileOutputStream.write(imageBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main4(String[] args) throws Exception {
        String s = LoadContentByPath("E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\hex2pdf\\4.txt");
        byte[] b = HexUtil.decodeHex(s);


        buff2Image(b, "E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\hex2pdf\\test15.pdf");
    }
    public static void main(String[] args) throws Exception {
        String s = LoadContentByPath("E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\hex2pdf\\7.txt");
        byte[] b = Base64.getDecoder().decode(s);
        // buff2Image(b, "E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\hex2pdf\\test004.pdf");
    }

    /**
     * Created by liuyikai on 2016/8/13.
     */
    public static String LoadContentByPath(String path) throws IOException {
        InputStream is = new FileInputStream(path);
        BufferedReader in = new BufferedReader(new InputStreamReader(is));
        StringBuffer buffer = new StringBuffer();
        String line = "";
        while ((line = in.readLine()) != null) {
            buffer.append(line);
        }
        return buffer.toString();

    }


    static void buff2Image(byte[] b, String tagSrc) throws Exception {
        FileOutputStream fout = new FileOutputStream(tagSrc);
        //将字节写入文件
        fout.write(b);
        fout.close();
    }

    public static byte[] hexStringToBytes(String hexString) {
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        hexString = hexString.toUpperCase();
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return d;
    }

    private static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    static byte[] image2Bytes(String imgSrc) throws Exception {
        FileInputStream fin = new FileInputStream(new File(imgSrc));
        //可能溢出,简单起见就不考虑太多,如果太大就要另外想办法，比如一次传入固定长度byte[]
        byte[] bytes = new byte[fin.available()];
        //将文件内容写入字节数组，提供测试的case
        fin.read(bytes);
        fin.close();
        return bytes;
    }

    public static String hexString2binaryString(String hexString) {
        if (hexString == null || hexString.length() % 2 != 0)
            return null;
        String bString = "", tmp;
        for (int i = 0; i < hexString.length(); i++) {
            tmp = "0000"
                    + Integer.toBinaryString(Integer.parseInt(hexString
                    .substring(i, i + 1), 16));
            bString += tmp.substring(tmp.length() - 4);
        }
        return bString;
    }

    public static String binaryString2hexString(String bString) {
        if (bString == null || bString.equals("") || bString.length() % 8 != 0)
            return null;
        StringBuffer tmp = new StringBuffer();
        int iTmp = 0;
        for (int i = 0; i < bString.length(); i += 4) {
            iTmp = 0;
            for (int j = 0; j < 4; j++) {
                iTmp += Integer.parseInt(bString.substring(i + j, i + j + 1)) << (4 - j - 1);
            }
            tmp.append(Integer.toHexString(iTmp));
        }
        return tmp.toString();
    }
}

