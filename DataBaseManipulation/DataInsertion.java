package DataBaseManipulation;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class DataInsertion {
	public static void main(String args[]){
		System.out.println("DICKS");
	}
	
	//only adds a node, saving has to be done afterwards
	public static void addStudent(Document doc, String user_id, 
												String password,
												String name, 
												String usertype,
												String email,
												String school,
												String gender,
												String level) {
		
		//add student to document
		Element root = doc.getDocumentElement();
		
		Attr userIDAttr = doc.createAttribute("id");
		userIDAttr.setValue(user_id);
		
		Attr passwordAttr = doc.createAttribute("password");
		passwordAttr.setValue(password);
		
		Attr nameAttr = doc.createAttribute("name");
		nameAttr.setValue(name);
		
		Attr usertypeAttr = doc.createAttribute("usertype");
		usertypeAttr.setValue(usertype);
		
		Attr emailAttr = doc.createAttribute("email");
		emailAttr.setValue(email);
		
		Attr schoolAttr = doc.createAttribute("school");
		schoolAttr.setValue(school);
		
		Attr genderAttr = doc.createAttribute("gender");
		genderAttr.setValue(gender);
		
		Attr levelAttr = doc.createAttribute("level");
		levelAttr.setValue(level);
		
		Element student = doc.createElement("student");
		student.setAttributeNode(userIDAttr);
		student.setAttributeNode(passwordAttr);
		student.setAttributeNode(nameAttr);
		student.setAttributeNode(usertypeAttr);
		student.setAttributeNode(emailAttr);
		student.setAttributeNode(schoolAttr);
		student.setAttributeNode(schoolAttr);
		student.setAttributeNode(genderAttr);
		student.setAttributeNode(levelAttr);
		
		root.appendChild(student);
	}
	
	public static void addSchool(Document doc, String schoolName) {
		Element root = doc.getDocumentElement();
		
		Element school = doc.createElement("school");
		school.setAttribute("name", schoolName);
		root.appendChild(school);
	}
	
	public static void addTeacher (Document doc, String id, 
												 String name,
												 String password,
												 String phone_number,
												 String email,
												 String school) {
		Element root = doc.getDocumentElement();
		
		Element teacher = doc.createElement("teacher");
		teacher.setAttribute("name", name);
		teacher.setAttribute("password", password);
		teacher.setAttribute("phone_number", phone_number);
		teacher.setAttribute("email", email);
		teacher.setAttribute("school", school);
		
		root.appendChild(teacher);
	}
	
	public static void addClass(Document doc, String class_id, String name, String[] ids, String school_id) {
		Element root = doc.getDocumentElement();
		
		Element classAdded = doc.createElement("class");
		classAdded.setAttribute("id", class_id);
		classAdded.setAttribute("name", name);
		classAdded.setAttribute("school_id", school_id);
		
		for(int i=0; i < ids.length; i++) {
			Element student = doc.createElement("student");
			student.setAttribute("id", ids[i]);
			classAdded.appendChild(student);
		}
		
		root.appendChild(classAdded);
	}

}
