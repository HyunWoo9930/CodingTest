package CodingTest;


import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public class XPathTest {
  public static void main(String[] args) {
    try{
    String xmlString ="<bookstore>"
        + "<book><title>Everyday Italian</title><author>Giada De Laurentiis</author><year>2005</year><price>30.00</price></book>"
        + "<book><title>Harry Potter</title><author>J K. Rowling</author><year>2005</year><price>29.99</price></book>"
        + "<book><title>Query Kick Start</title><author>James McGovern</author><author>Per Bothner</author><author>Kurt Cagle</author><author>James Linn</author><author>Vaidyanathan Nagarajan</author><year>2003</year><price>49.99</price></book>"
        + "</bookstore>";


      InputSource inputSource = new InputSource(new StringReader(xmlString));
      Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder()
          .parse(inputSource);

//        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(input);
      XPath xpath = XPathFactory.newInstance().newXPath();

      Node node = (Node) xpath.evaluate("//bookstore//book", document, XPathConstants.NODE);
      System.out.println(node.getTextContent());
    } catch (Exception e) {
      e.printStackTrace();

    }


  }

}
