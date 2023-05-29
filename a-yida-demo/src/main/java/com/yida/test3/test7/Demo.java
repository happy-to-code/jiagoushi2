package com.yida.test3.test7;

import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;
import sun.misc.BASE64Encoder;

import java.util.Base64;

/**
 * @Auther: yida
 * @Date: 2023/5/22 10:54
 * @Description:
 */
public class Demo {
	public static void main(String[] args) {
		byte[] bytes = FileUtil.readBytes("C:\\myfile\\yida-jgs2\\a-yida-demo\\src\\main\\java\\com\\yida\\test3\\test7\\1212.png");
		
		byte[] encode = Base64.getEncoder().encode(bytes);
		System.out.println("encode = " + encode);
		
		// BASE64Encoder encoder = new BASE64Encoder();
		// String base64Str = encoder.encode(bytes);
		// base64Str.replaceAll("(\r\n|\r|\n|\n\r)", "");// 替换base64后的字符串中的回车换行
		// System.out.println("base64Str = " + base64Str);
		String base64Str = Base64.getEncoder().encodeToString(encode);
		
		// data:image/png;base64,
		String path = "C:\\myfile\\yida-jgs2\\a-yida-demo\\src\\main\\java\\com\\yida\\test3\\test7\\22.png";
		// FileUtil.writeBytes(FileUtil.);
		base64Str = base64Str.substring(base64Str.indexOf(",", 1) + 1);
		// 解密，解密的结果是一个byte数组
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] imgbytes = decoder.decode(base64Str);
		for (int i = 0; i < imgbytes.length; ++i) {
			if (imgbytes[i] < 0) {
				imgbytes[i] += 256;
			}
		}

		FileUtil.writeBytes(imgbytes,path);
		
	}
}
