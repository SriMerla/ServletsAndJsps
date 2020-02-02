package com.practise.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapsEx {
     
	public static Map<Integer,String> getResultList(final Map<Integer,Integer> inputMap){
		Map<Integer,String> resMap = new HashMap<Integer,String>();
		for(Integer marks:inputMap.values()){
        
			if(marks >= 90){
			
				resMap.put(marks, "Gold Medal");
				
			}
			else if(marks >= 80 && marks <= 90){
				
				 resMap.put(marks, "Silver Medal");
			}
			else if(marks >=70 && marks <= 80){
				 
				 resMap.put(marks, "Bronze Medal");
				
			}
			else{
				 
				resMap.put(marks, "No Medal");
			}
		}
		return resMap;
	}
	public static void main(String[] args) {
		
		Map<Integer, Integer> inputMap = new HashMap<Integer, Integer>();
		inputMap.put(101, 78);
		inputMap.put(102, 90);
		inputMap.put(103, 60);
		inputMap.put(104, 30);
		inputMap.put(105, 86);
		
		System.out.println(getResultList(inputMap));
		

	}

}
