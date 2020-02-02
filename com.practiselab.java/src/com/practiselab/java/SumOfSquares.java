package com.practiselab.java;

public class SumOfSquares {
	int sum = 0;
	int sumOfSquares;
	int p,q = 0;
	public int calculateDifference(int n){
		
		for(int i = 1; i<=n; i++){
			 p = i*i;
			sumOfSquares = sumOfSquares + p;
		      q = q + i;	
		}
		int squareOfSum = q*q;
		
		System.out.println("Sum of Squares : "+sumOfSquares);
		System.out.println("Square of Sum"+squareOfSum);
		sum = sumOfSquares - squareOfSum;
		
		return sum;
	}

	public static void main(String[] args) {
		SumOfSquares sumOfSquares = new SumOfSquares();
		System.out.println("difference between the sum of the squares and the square of the sum of the first n natural numbers : " + sumOfSquares.calculateDifference(10));

	}

}
