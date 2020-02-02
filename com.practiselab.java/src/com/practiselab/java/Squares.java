package com.practiselab.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Squares {
    public Map<Integer, Integer> getSquares(int[] num){
    	Map<Integer, Integer> resMap = new HashMap<Integer, Integer>();
    	for(int i =0; i<= num.length -1; i++){
    		int n = num[i];
    		int m = n*n;
    		resMap.put(n, m);
    	}
    	
		return resMap;
    	
    }
	public static void main(String[] args) {
		Squares sq = new Squares();
		int[] num = {2, 4, 6, 7, 8};
		System.out.println(sq.getSquares(num));
		

	}

}
