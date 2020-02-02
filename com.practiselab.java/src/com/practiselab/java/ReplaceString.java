package com.practiselab.java;

public class ReplaceString {
	
	public String alterString(String str){
		String newStr = "";
		int len = str.length();
		for(int i=0; i<=len-1; i++){
			char c = str.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
				newStr += c;
			}
			else{
				
				char ch = ++c;
				newStr = newStr + ch;
				
				
			}
				
		}
		return newStr;
	}

	public static void main(String[] args) {
		ReplaceString replace = new ReplaceString();
		System.out.println(replace.alterString("java"));

	}

}
