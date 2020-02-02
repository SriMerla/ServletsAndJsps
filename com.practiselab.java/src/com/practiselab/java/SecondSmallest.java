package com.practiselab.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SecondSmallest {
	
	public int getSecondSmallest(int[] inputArr){
		
		List<Integer> list = new ArrayList<Integer>();
		for(int num : inputArr){
			list.add(num);
		}
		Collections.sort(list);
		System.out.println(list);
		int len = list.size();
		int secondSmallest = list.get(1);
		return secondSmallest;
	}

	public static void main(String[] args) {
		SecondSmallest ss = new SecondSmallest();
		int[] inputArr = {75, 13, 27,45, 65};
		System.out.println("Second Smallest Number : "+ss.getSecondSmallest(inputArr));

	}

}
