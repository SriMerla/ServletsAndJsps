package java_dom_parse;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.DatatypeConverter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MyDomParser {

	public static void main(String[] args) {
		
		MyDomParser myDomParser = new MyDomParser();
		
		for(Student student:myDomParser.parseAndGetStudents("students.xml")){
			System.out.println("----------------------------------------");
			System.out.println("Student Name - " + student.getName());
			System.out.println("Student Age - " + student.getAge());
			System.out.println("Subject wise marks list - " + student.getSubjectMarks());
			System.out.println("----------------------------------------");
		}

	}
	
	public List<Student> parseAndGetStudents(String fileName){
		
		List<Student> students = new ArrayList<Student>();
		//List<Integer> subjects = new ArrayList<Integer>();
		DocumentBuilderFactory  factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(fileName);
			NodeList studentList = doc.getElementsByTagName("student");
			for(int i =0; i<studentList.getLength(); i++){
				Student student = new Student();
				List<Integer> subjectMarks = new ArrayList<Integer>();
				Node p = studentList.item(i);
				//System.out.println("Current Element : " + p.getNodeName());
				if(p.getNodeType()==Node.ELEMENT_NODE){
					Element ele = (Element) p;
					//System.out.println("Student id : " + ele.getAttribute("id"));
					String name =ele.getElementsByTagName("name").item(0).getTextContent();
					String age =ele.getElementsByTagName("age").item(0).getTextContent();
					NodeList subList = ele.getElementsByTagName("subjects");
					 student.setName(name);
					 student.setAge(age);
					
					 
					
					 
					 for(int j = 0; j<subList.getLength() ; j++){
						Node n = subList.item(j);
						//System.out.println("Current Element : " + n.getNodeName());
						if(n.getNodeType()==Node.ELEMENT_NODE){
							Element ele1 = (Element) n;
							String maths = ele1.getElementsByTagName("maths").item(0).getTextContent();
							String physics = ele1.getElementsByTagName("physics").item(0).getTextContent();
							String english = ele1.getElementsByTagName("english").item(0).getTextContent();
						    // int math = DatatypeConverter.parseInt(maths);
						     //int phy = DatatypeConverter.parseInt(physics);
						     //int eng = DatatypeConverter.parseInt(english);
						     
						     int math = Integer.parseInt(maths);
						     int phy = Integer.parseInt(physics);
						     int eng = Integer.parseInt(english);
							subjectMarks.add(math);
							subjectMarks.add(phy);
							subjectMarks.add(eng);
							student.setSubjects(subjectMarks);
						}
					 }
					 
					 students.add(student);
					
					 //System.out.println("StudName : " + student.getName());
					// System.out.println("StudAge : " + student.getAge());
								
					//System.out.println("Student name : " + name );	
					//System.out.println("Student name : " + age );	
		
							
							//System.out.println( "person " + id + ":" + tagName + "=" + studName);
						}
					}
					
				
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return students;
		
	}

}
