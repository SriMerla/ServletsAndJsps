package com.practiselab.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	public int[] getSorted(int[] inputArr){
		int[] resArr = new int[inputArr.length];
		String str = "";
		for(int i = 0; i<= inputArr.length - 1 ; i++){
			String ele = Integer.toString(inputArr[i]);
			for(int j = ele.length()- 1; j>=0; j--){
				char c = ele.charAt(j);
			       str = str + c;
			       inputArr[i] = Integer.parseInt(str);	      
			}
			str = "";
		}
		
		List<Integer> list = new ArrayList<Integer>();
		for( int n : inputArr){
			list.add(n);
		}
		Collections.sort(list);
		int listSize = list.size();
		for(int m =0; m <= listSize-1; m++){
			resArr[m] = list.get(m);
		}
		return resArr;
	}

	public static void main(String[] args) {
		ReverseArray reverse = new ReverseArray();
		int [] inputArr = {12, 23, 96, 45};
		int[] res = new int[inputArr.length];
				res = reverse.getSorted(inputArr);
		for(int n : res){
			System.out.println(n);
		}
		
		

	}

}
