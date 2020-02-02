package java_dom_parse;

import java.util.List;
import java.util.Map;

public class Student{
	
	private String name;
	private String age;
	public  Map<String, Integer> subjectMarks;
	
	
	public Map<String, Integer> getSubjectMarks() {
		return subjectMarks;
	}

	public void setSubjectMarks(Map<String, Integer> subjectMarks) {
		this.subjectMarks = subjectMarks;
	}

	public Student(){
		
	}
	
	Student(String name, String age){
		this.name=name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		this.name = name;
		return name;
	}

	public String getAge() {
		return age;
	}

	public String setAge(String age) {
		this.age=age;
		return age;
	}


}
