package com.practice.numbers;

import java.util.Scanner;

public class FactorialOfaNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Taking input from the user
		System.out.println("Please enter the number : ");
		int num = scan.nextInt();
		// multiplying each number using for loop
		int fact = 1;
		for(int i=num;i>=1;i--) {
			fact *= i;
		}
		System.out.println("Factorial of "+num+" is = "+fact);
		//releasing resources
		scan.close();
	}

}
