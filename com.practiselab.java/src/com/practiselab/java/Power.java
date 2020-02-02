package com.practiselab.java;

public class Power {
	
	public boolean checkNumber(int n){
		boolean flag = false;
		while(n%2 == 0){
			n= n/2;
		}
		if(n == 1){
			flag = true;
		}
		else{
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		        
        Power power = new Power();
        System.out.println("The given number is power of 2: "+power.checkNumber(64));
	}

}
