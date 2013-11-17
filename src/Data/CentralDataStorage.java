package Data;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class CentralDataStorage {
	public static Document classDoc = null;
	public static Document studentDoc = null;
	public static Document teacherDoc = null;
	
	public static final String classDocFileName = "classDoc.xml";
	public static final String studentDocFileName = "studentDoc.xml";
	public static final String teacherDocFileName = "teacherDoc.xml";
	
	public static void loadData() throws ParserConfigurationException, SAXException, IOException {
		//loads all XML docs into RAM
		
		//class file is loaded
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		classDoc = dBuilder.parse(new File(classDocFileName));
		
		//student file is loaded
		studentDoc = dBuilder.parse(new File(studentDocFileName));
		
		//teacher file is loaded
		teacherDoc = dBuilder.parse(new File(teacherDocFileName));
		
	}
	
	
}
