package com.practiselab.java;

public class NaturalNumSum {
	int sum=0;
	public int calculateSum(int n){
		
		for(int i = 1; i<=n; i++){
		if(i%3 == 0 || i%5 == 0){
		 System.out.println("Natural number divisible by 3 or 5 : " +i);
		 sum = sum + i;
		}
		}
		return sum;
	}

	public static void main(String[] args) {
		NaturalNumSum naturalNumsum = new NaturalNumSum();
		System.out.println("The sum of first 10 natural numbers : "+naturalNumsum.calculateSum(10));
		
	}

}
