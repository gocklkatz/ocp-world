package io.gocklkatz;

import java.io.InputStream;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

// Java SE 9 Standard-Bibliothek (Ullenboom), Kapitel 10
public class MyXML {
    
    public static void main(String[] args) throws Exception {
        Path path = Path.of("test.xml");
        //List<String> strings = Files.readAllLines(path);
        //for(String s : strings) {
        //    System.out.println(s);
        //}

        // ---

        // https://www.baeldung.com/java-xerces-dom-parsing
        // https://docs.oracle.com/javase/tutorial/jaxp/dom/index.html
        // https://www.oracle.com/java/technologies/jaxp-introduction.html
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        try (InputStream in = Files.newInputStream(path)) {
            Document doc = builder.parse(in);
            System.out.println(doc.getFirstChild().getTextContent());
        }

        // SAX
        SAXParserFactory factory2 = SAXParserFactory.newInstance();
        SAXParser parser2 = factory2.newSAXParser();

        // StAX
        XMLInputFactory factory1 = XMLInputFactory.newInstance();
        XMLStreamReader parser11 = factory1.createXMLStreamReader((Reader) null);
        XMLEventReader parser12 = factory1.createXMLEventReader((Reader) null);

        // XPath
        XPathFactory factory3 = XPathFactory.newInstance();
        XPathExpression expression = factory3.newXPath().compile("/party");

        // XSLT


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
