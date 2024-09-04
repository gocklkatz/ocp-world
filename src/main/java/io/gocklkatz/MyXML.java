package io.gocklkatz;

import java.nio.file.Files;
import java.nio.file.Path;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class MyXML {
    
    public static void main(String[] args) throws Exception {
        Path path = Path.of("test.xml");
        //List<String> strings = Files.readAllLines(path);
        //for(String s : strings) {
        //    System.out.println(s);
        //}

        // Load test.xml with DOM parser
        // https://www.baeldung.com/java-xerces-dom-parsing
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse(Files.newInputStream(path));
        doc.getDocumentElement().normalize();

        NodeList nodeList = doc.getElementsByTagName("sk:root");
        System.out.println("Nodelist length: " + nodeList.getLength());

        // Load test.xml with SAX parser

        // Get <fl:elem1> from test.xml

        // ---

        // https://stackoverflow.com/a/528512
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        DOMImplementation domImpl = db.getDOMImplementation();

        Document document = domImpl.createDocument("urn:example.namespace", 
                "my:example", null);
        Element element = document.createElementNS("http://another.namespace",
                "element");
        document.getDocumentElement().appendChild(element);
    }
}
