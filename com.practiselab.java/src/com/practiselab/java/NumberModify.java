package com.practiselab.java;

public class NumberModify {
	
	public int modifyNumber(int number){
		String str="";
		String num = Integer.toString(number);
		int len = num.length();
		int j = len -1;
		char m = 0;
		for(int i = 0; i<= len-1;i++){
			char n = num.charAt(i);
			if(j >0){
			 m = num.charAt(len-j);
				j--;
			}
			
			int diff = m-n;
			int res = Math.abs(diff);
			str = str + res;
			
		}
		System.out.println(str);
		int l = str.length();
		String newStr = str.substring(0, l-1)+ num.substring(len-1);
		
		int newNum = Integer.parseInt(newStr);
		return newNum;
	}

	public static void main(String[] args) {
		NumberModify numMod = new NumberModify();
		System.out.println("Modified Number : "+numMod.modifyNumber(45862));

	}

}
