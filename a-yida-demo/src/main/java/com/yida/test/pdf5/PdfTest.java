package com.yida.test.pdf5;

import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.UUID;

public class PdfTest {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String path = "C:\\myfile\\yida-jgs2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\pdf5\\11.29THD批量 美东.pdf";
		testPdf(path);
		long end = System.currentTimeMillis();
		
		// 9400
		System.out.println("end-start = " + (end - start));
	}
	
	public static void testPdf(String path) {
		File file = new File(path);
		InputStream is = null;
		PDDocument document = null;
		try {
			if (path.endsWith(".pdf")) {
				document = PDDocument.load(file);
				int pageSize = document.getNumberOfPages();
				// 一页一页读取
				for (int i = 0; i < pageSize; i++) {
					// 文本内容
					// PDFTextStripper stripper = new PDFTextStripper();
					// // 设置按顺序输出
					// stripper.setSortByPosition(true);
					// stripper.setStartPage(i + 1);
					// stripper.setEndPage(i + 1);
					// String text = stripper.getText(document);
					// System.out.println(text.trim());
					// System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
					
					// 图片内容
					PDPage page = document.getPage(i);
					PDResources resources = page.getResources();
					Iterable<COSName> cosNames = resources.getXObjectNames();
					if (cosNames != null) {
						Iterator<COSName> cosNamesIter = cosNames.iterator();
						while (cosNamesIter.hasNext()) {
							COSName cosName = cosNamesIter.next();
							if (resources.isImageXObject(cosName)) {
								PDImageXObject Ipdmage = (PDImageXObject) resources.getXObject(cosName);
								BufferedImage image = Ipdmage.getImage();
								FileOutputStream out = new FileOutputStream(UUID.randomUUID() + ".png");
								try {
									ImageIO.write(image, "png", out);
								} catch (IOException e) {
								} finally {
									try {
										out.close();
									} catch (IOException e) {
									}
								}
							}
						}
					}
				}
			}
		} catch (InvalidPasswordException e) {
		} catch (IOException e) {
		} finally {
			try {
				if (document != null) {
					document.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
			}
		}
	}
	
}