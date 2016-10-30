package XmlParsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import org.xml.sax.SAXException;


public class Sax {
    public static void main(String[] args) throws FileNotFoundException, ParserConfigurationException, SAXException {
        SAXParserFactory factory = SAXParserFactory.newInstance();

        factory.setValidating(true);
        factory.setNamespaceAware(false);
        SAXParser parser;
        parser = factory.newSAXParser();
        try {
            parser.parse(new FileInputStream("E:\\java\\InnerClassTest\\src\\main\\java\\XmlParsers\\books.xml"), new MyParser());
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

