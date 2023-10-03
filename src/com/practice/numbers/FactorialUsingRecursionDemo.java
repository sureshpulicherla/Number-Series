package com.practice.numbers;

import java.util.Scanner;

public class FactorialUsingRecursionDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//taking input from user
		System.out.println("Please enter the number : ");
		int num = scan.nextInt();
		// creating object for FactorialUsingRecursion class
		FactorialUsingRecursion f = new FactorialUsingRecursion();
		// storing the factorial logic into fact variable
		int fact = f.factorialRecursion(num);
		System.out.println("Factorial of "+num+" is "+fact);
		// releasing resources
		scan.close();
	}

}
