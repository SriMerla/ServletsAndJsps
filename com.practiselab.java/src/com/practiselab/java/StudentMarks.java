package com.practiselab.java;

import java.util.HashMap;
import java.util.Map.Entry;

public class StudentMarks {
     public HashMap<Integer, String> getStudents(HashMap<Integer, Integer> inputMap){
		
    	HashMap<Integer, String> resMap = new HashMap<Integer, String>();
    	for(Entry<Integer, Integer> entry : inputMap.entrySet()){
    		int id = entry.getKey();
    		int marks = entry.getValue();
    		if(marks >= 90){
    			resMap.put(id, "Gold");
    		}
    		else if(marks >= 80 && marks < 90){
    			resMap.put(id, "Silver");
    		}
    		else if(marks >=70 && marks < 80){
    			resMap.put(id, "Bronze");
    		}
    		else{
    			resMap.put(id, "No Medal");
    		}
    	}
    	 
       return resMap;
    	 
     }
	public static void main(String[] args) {
		StudentMarks stud = new StudentMarks();
		HashMap<Integer, Integer> inputMap = new HashMap<Integer, Integer>();
		inputMap.put(101, 98);
		inputMap.put(102, 86);
		inputMap.put(103, 77);
		inputMap.put(104, 73);
		inputMap.put(105, 60);
		System.out.println(stud.getStudents(inputMap));
		

	}

}
