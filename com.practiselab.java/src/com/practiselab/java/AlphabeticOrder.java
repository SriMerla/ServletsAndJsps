package com.practiselab.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlphabeticOrder {
	public String[] getArrayList(String[] elements){
		
		List<String> list = new ArrayList<String>();
		list = Arrays.asList(elements);
		Collections.sort(list);
		int listSize = list.size();
		String [] modifiedArray = new String[listSize];
		if(listSize%2 == 0){
			for(int i=0; i<= (listSize/2)-1; i++){
			   String ele = list.get(i).toUpperCase();
				modifiedArray[i] = ele;
				//System.out.println(ele.toUpperCase());	
				
			}
		}else{
			for(int i=0; i<= (listSize/2)+1; i++){
				for(String ele:list){
					modifiedArray[i] = ele.toUpperCase();
					
				}
			}
		}
		
		for(int i = (listSize/2); i<= listSize-1; i++){
			String ele = list.get(i).toLowerCase();
			modifiedArray[i] = ele;
			//System.out.println(ele.toLowerCase());
		}
		
		return modifiedArray;
	}

	public static void main(String[] args) {
		AlphabeticOrder alphabeticOrder = new AlphabeticOrder();
		String[] elements = {"Mango", "Apple", "Orange", "Banana" };
		
		String [] modArray = alphabeticOrder.getArrayList(elements);
		for(String e : modArray){
			System.out.println(e);
		}
		

	}

}
