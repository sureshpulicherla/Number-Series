package com.practice.numbers;

import java.util.Scanner;

public class SwappingOfNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Taking inputs from user
		System.out.println("Please enter your first number : ");
		int num1 = scan.nextInt();
		System.out.println("Please enter your second number : ");
		int num2 = scan.nextInt();
		System.out.println("Before Swapping");
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
		// Swapping the numbers without third variable
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After Swapping");
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		// releasing resources
		scan.close();
	}

}
