package java_sax_parse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java_dom_parse.MyDomParser;
import java_dom_parse.Student;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MySaxParserEx {
	 Student student ;
	
	 List<Student> studentList = new ArrayList<Student>();
	public List<Student> saxParseAndGetStudents(String fileName){
		try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			DefaultHandler handler = new DefaultHandler() {

			boolean bname = false;
			boolean bage = false;
			boolean bmaths = false;
			boolean bphysics = false;
			boolean benglish = false;
			
			
			public void startElement(String uri, String localName,String qName, 
		                Attributes attributes) throws SAXException {
				
				 if(qName.equalsIgnoreCase("student")){
					 student = new Student();
				}
				
				if (qName.equalsIgnoreCase("name")) {
					bname = true;
				}

				if (qName.equalsIgnoreCase("age")) {
					bage = true;
				}
				if(qName.equalsIgnoreCase("subjects")){
					student.subjectMarks= new HashMap<String, Integer>();
					
				}
				if(qName.equalsIgnoreCase("maths")){
					
					 bmaths = true;
				}
				if(qName.equalsIgnoreCase("physics")){
					 bphysics = true;
				}
				if(qName.equalsIgnoreCase("english")){
					 benglish = true;
				}
				


			}

			public void endElement(String uri, String localName,
				String qName) throws SAXException {
				
				if(qName.equalsIgnoreCase("student")){
				studentList.add(student);
				}

			}
			

			public void characters(char ch[], int start, int length) throws SAXException {
				
				if (bname) {
					String studentName = new String(ch, start, length);
					student.setName(studentName);
					bname = false;
					
				}

				if (bage) {
					String studentAge = new String(ch, start, length);
					student.setAge(studentAge);
					bage = false;
				}
				if (bmaths) {
					int mathMarks = Integer.parseInt(new String(ch, start, length));
					student.subjectMarks.put("maths", mathMarks);
					bmaths = false;
				}
				if (bphysics) {
					int phyMarks = Integer.parseInt(new String(ch, start, length));
					student.subjectMarks.put("physics", phyMarks);
					bphysics = false;
				}
				if (benglish) {
					int engMarks = Integer.parseInt(new String(ch, start, length));
					student.subjectMarks.put("english", engMarks);
					benglish = false;
				}
				
			}
			
		     };
		    
		     

		       saxParser.parse("NewStudents.xml", handler);
		 
		     } catch (Exception e) {
		       e.printStackTrace();
		     }
		return studentList;
		
		
	}

	public static void main(String[] args) {
		
		MySaxParserEx mySaxParserEx = new MySaxParserEx();
		
		for(Student student:mySaxParserEx.saxParseAndGetStudents("NewStudents.xml")){
			System.out.println("----------------------------------------");
			System.out.println("Student Name - " + student.getName());
			System.out.println("Student Age - "  + student.getAge());
			System.out.println("Subject wise marks list - " + student.getSubjectMarks());
			System.out.println("----------------------------------------");
		}
		 

	}

}
