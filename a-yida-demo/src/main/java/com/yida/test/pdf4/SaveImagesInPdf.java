package com.yida.test.pdf4;

import org.apache.pdfbox.contentstream.PDFStreamEngine;
import org.apache.pdfbox.contentstream.operator.Operator;
import org.apache.pdfbox.cos.COSBase;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.graphics.PDXObject;
import org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * This is an example on how to extract images from pdf.
 */
public class SaveImagesInPdf extends PDFStreamEngine {
    /**
     * Default constructor.
     *
     * @throws IOException If there is an error loading text stripper properties.
     */
    public SaveImagesInPdf()  {
    }

    public int imageNumber = 1;

    /**
     * @param args The command line arguments.
     * @throws IOException If there is an error parsing the document.
     */
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        PDDocument document = null;
        String fileName = "C:\\myfile\\yida-jgs2\\a-yida-demo\\src\\main\\java\\com\\yida\\test\\pdf4\\11.29THD批量 美东.pdf";
        try {
            document = PDDocument.load(new File(fileName));
            SaveImagesInPdf printer = new SaveImagesInPdf();
            int pageNum = 0;
            for (PDPage page : document.getPages()) {
                pageNum++;
                System.out.println("Processing page: " + pageNum);
                printer.processPage(page);
            }
        } finally {
            if (document != null) {
                document.close();
            }
        }
        long end = System.currentTimeMillis();

        // 7274
        System.out.println("pdfbox总耗时：" + (end - start));
    }

    /**
     * @param operator The operation to perform.
     * @param operands The list of arguments.
     * @throws IOException If there is an error processing the operation.
     */
    @Override
    protected void processOperator(Operator operator, List<COSBase> operands) throws IOException {
        String operation = operator.getName();
        if ("Do".equals(operation)) {
            COSName objectName = (COSName) operands.get(0);
            PDXObject xobject = getResources().getXObject(objectName);
            if (xobject instanceof PDImageXObject) {
                PDImageXObject image = (PDImageXObject) xobject;

                // same image to local
                BufferedImage bImage = image.getImage();
                ImageIO.write(bImage, "PNG", new File("pdf_box_image_" + imageNumber + ".png"));
                System.out.println("Image saved.");
                imageNumber++;

            } else if (xobject instanceof PDFormXObject) {
                PDFormXObject form = (PDFormXObject) xobject;
                showForm(form);
            }
        } else {
            super.processOperator(operator, operands);
        }
    }

}
