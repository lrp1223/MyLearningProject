package com.rongpengli.designpattern._21Interpreter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class XmlUtil {
    public static Document getRoot(String filePathName) throws Exception {
        Document document = null;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        document = builder.parse(filePathName);
        document.normalize();

        return document;
    }
}
