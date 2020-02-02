package com.practiselab.java;

import java.util.Set;
import java.util.TreeSet;

public class ModifyArray {
	
	public int[] modifyArray(int[] input){
		int[] modifyArray = new int[input.length];
		Set<Integer> uniqueList = new TreeSet<Integer>();
		for(int n : input){
			uniqueList.add(n);
		}
		int len = uniqueList.size();
		for(int n : uniqueList){
			
			len--;
			modifyArray[len] = n;
			
		
			}
		return modifyArray;
 	}

	public static void main(String[] args) {
		ModifyArray modify = new ModifyArray();
		int [] input = {12, 23, 96, 45, 12};
		int[] res = new int[input.length];
				res = modify.modifyArray(input);
		for(int n : res){
			System.out.println(n);
		}
	}

}
