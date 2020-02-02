package com.practise.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
	public static Map<Integer,Integer> getResultList(final Map<Integer,Integer> inputMap){
		Map<Integer,Integer> resMap = new HashMap<Integer,Integer>();
		for(Integer marks:inputMap.values()){
               for(Integer id: inputMap.keySet()){
            	  
            	   resMap.put(marks, id);
            	   
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
