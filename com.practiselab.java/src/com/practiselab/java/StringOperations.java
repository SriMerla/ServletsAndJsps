package com.practiselab.java;

import java.util.ArrayList;
import java.util.List;

public class StringOperations {
	

	public List<String> modifyStrings(String s1, String s2){
		List<String> list = new ArrayList<String>();
		int len1 = s1.length();
		int len2 = s2.length();
		String Str1="";
		String Str2 = "";
		String Str3 = "",Str4,Str5 = "";
		String s;
		
		//******1)Character in each alternate index of s1 should be replaced with s2//
		
		for(int i = 0; i<= len1-1; i++){
			if(i%2 == 0){
				s = Character.toString(s1.charAt(i));
				s =s2;
			}else{
				
				s = Character.toString(s1.charAt(i));
			}
			Str1 = Str1+s;
			
		}
	   list.add(Str1);
	   
	   //******2)if s2 appears more than once in s1, replace the last occurrence of s2 in s1 with reverse s2//
	   //******3)if s2 occurs more than once in s1, delete the first occurrence of s2 in s1  
	   int count=0;
	   if(s1.contains(s2)){
		 String[] arr= s1.split(s2);
		 
		  for( String str : arr){
			  //System.out.println(str);
			  if(str != s2){
				  count++;
			  }
			  //System.out.println(count);
		  }
		  if(count >1){
			  //***2)
			  int index = s1.lastIndexOf(s2);
			  //System.out.println(index);
			  StringBuffer sb = new StringBuffer(s2);
			 Str2 = s1.substring(0, index)+ sb.reverse();
			
			 //***3)
			 int index3 = s1.indexOf(s2);
			 Str3 = s1.substring(0, index3)+s1.substring(index3+len2, len1);
			
		  }
		  else{
			  Str2 = s1 + s2;
			  Str3= s1;
		  }
	   }
	   list.add(Str2);
	   list.add(Str3);
	   
	   //*****4)Divide s2 into two halves and add the first half to start of s1 and second half to end of s1
	     String fhalf="";
	     String shalf="";
	     int halflen = len2/2;
	     for (int i = 0; i<= halflen-1; i++){
	    	 String c = Character.toString(s2.charAt(i));
	    	 fhalf = fhalf+ c;
	     }
	     shalf = s2.substring(halflen, len2);
	     Str4 = fhalf + s1 + shalf;
	     list.add(Str4);
	     
	     //******5) if s1 contains characters that is in s2 change all such characters to *
	     
	     for(int i = 0; i<= len1-1; i++){
	    	 String k =Character.toString((s1.charAt(i)));
	    	 if(s2.contains(k)){
	    		 k = "*";
	    	 }
	    	 Str5 = Str5+k;
	    	
	     }
	    
	     list.add(Str5);
	   
	     //**** To print the elements in the list
	     
	     
	   
		return list;
	}

	public static void main(String[] args) {
		StringOperations sp = new StringOperations();
		System.out.println(sp.modifyStrings("JAVAJAVA", "VA"));

	}

}
