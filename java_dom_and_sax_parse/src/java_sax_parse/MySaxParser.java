package java_sax_parse;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;

import java_dom_parse.MyDomParser;
import java_dom_parse.Student;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MySaxParser extends DefaultHandler{
	  private List<NewStudent> newStudentList;
	  private NewStudent newStud = null;
	  private StringBuilder data = null;
	   public List<NewStudent> saxParseAndGetStudents(String fileName){
		   return newStudentList;
	   }

				boolean bname = false;
				boolean bage = false;
				 
				
				public void startElement(String uri, String localName,String qName, 
			                Attributes attributes) throws SAXException {

					//System.out.println("Start Element :" + qName);
                    if(qName.equalsIgnoreCase("NewStudent")){
                       String id = attributes.getValue("id");
                       newStud = new NewStudent();
                       newStud.setId(Integer.parseInt(id));
                       if (newStudentList == null){
                    	  newStudentList = new ArrayList<>();
                       }
                    	
                       else if (qName.equalsIgnoreCase("name")) {
						bname = true;
					    }

                       else if (qName.equalsIgnoreCase("age")) {
						bage = true;
					   }
                        
                      }
                    data = new StringBuilder();
				}

				public void endElement(String uri, String localName,
					String qName) throws SAXException {

					//System.out.println("End Element :" + qName);

				}

				public void characters(char ch[], int start, int length) throws SAXException {

					if (bname) {
						String studName = new String(ch, start, length);
						System.out.println("Student Name : " + studName);
						bname = false;
						newStud.setName(studName);
					}

					if (bage) {
						
			            String studAge = new String(ch, start, length);
						System.out.println("Student Age : " + studAge);
						bage = false;
						newStud.setAge(studAge);
					}
					
					
					
				}
				
	public static void main(String[] args) {
		
		System.out.println("From Main Method");
        
		MySaxParser mySaxParser = new MySaxParser();
		
		for(NewStudent student:mySaxParser.saxParseAndGetStudents("NewStudents.xml")){
			System.out.println("----------------------------------------");
			System.out.println("Student Name - " + student.getName());
			System.out.println("Student Age - " + student.getAge());
			//System.out.println("Subject wise marks list - " + student.getSubjectMarks());
			System.out.println("----------------------------------------");
		
	}
    System.out.println("End Of Main Method");
	}

}