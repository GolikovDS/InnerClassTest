package XmlParsers;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;


public class Dom {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        Dom dom = new Dom();
        dom.parseDomDoc();
        dom.createDomDoc();

    }

    public void parseDomDoc() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("E:\\java\\InnerClassTest\\src\\main\\java\\ru\\gds\\XmlParsers\\demo.xml"));

        document.getDocumentElement().normalize();
        System.out.println("Root element :" + document.getDocumentElement().getNodeName());

        NodeList list = document.getElementsByTagName("Staff");
        System.out.println("----------------------------");
        for (int i = 0; i < list.getLength(); i++) {
            Node node = list.item(i);
            System.out.println("\nCurrent Element :" + node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE){
                Element eElement = (Element) node;
                System.out.println("Attribute: " + eElement.getAttribute("Atr"));
                NodeList nList2 = document.getElementsByTagName("nickname");
                Node node1 = nList2.item(0);
                System.out.println("Cha: " + node1.getNodeName());
                NodeList nList3 = document.getElementsByTagName("Cal");
                Node node3 = nList3.item(0);
                System.out.println("Cha: " + node3.getNodeName());

            }

        }


    }

    public void createDomDoc() throws TransformerException, ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();


        Element rootElement = document.createElement("company");
        document.appendChild(rootElement);

        Element staff = document.createElement("Staff");
        rootElement.appendChild(staff);

        Element nickname = document.createElement("nickname");
        nickname.appendChild(document.createTextNode("mkyong"));
        staff.appendChild(nickname);

        Element element = document.createElement("Staff");
        Attr attr = document.createAttribute("Atr");
        attr.setValue("10");
        Element childEl = document.createElement("Cal");
        childEl.appendChild(document.createTextNode("111222"));
        element.appendChild(childEl);
        element.setAttributeNode(attr);
        rootElement.appendChild(element);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File("E:\\java\\InnerClassTest\\src\\main\\java\\ru\\gds\\XmlParsers\\demo.xml"));

        transformer.transform(source, result);

    }
}
