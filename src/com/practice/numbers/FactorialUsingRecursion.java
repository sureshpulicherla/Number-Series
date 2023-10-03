package com.practice.numbers;

public class FactorialUsingRecursion {
	public int factorialRecursion(int num) {
		// the given number is greater than 0 then execute the code
		if(num > 0) {
			return num*factorialRecursion(num-1);
		}
		// return 1 if number is less than 0 
		return 1;
	}
}
