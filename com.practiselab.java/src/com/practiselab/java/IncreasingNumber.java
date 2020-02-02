package com.practiselab.java;

public class IncreasingNumber {
	public boolean checkNumber(int number){
		String str = Integer.toString(number);
		int len = str.length();
		int f = 0;
		for(int i =0; i<=len-1; i++){
			char c = str.charAt(i);
			if(c <= str.charAt(i+1)){
				 f=1;
				break;
			}
		}
		if(f == 1){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		IncreasingNumber increasingNum = new IncreasingNumber();
		System.out.println(increasingNum.checkNumber(14258));

	}

}
