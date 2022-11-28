package com.yida.design_mode.creation_mode.simple_factory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {

    public static String getChartType() {
        try {
            // 创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            // config.xml的路径
            doc = builder.parse(new File("E:\\java_demo\\jiagoushi2\\a-yida-demo\\src\\main\\java\\com\\yida\\design_mode\\simple_factory\\config.xml"));
            // 获取包含图表类型的文本节点
            NodeList nl = doc.getElementsByTagName("shapeType");
            Node classNode = nl.item(0).getFirstChild();
            String shapeType = classNode.getNodeValue().trim();
            return shapeType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
