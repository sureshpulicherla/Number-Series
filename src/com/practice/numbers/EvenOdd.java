package com.practice.numbers;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Taking input from the user
		System.out.println("Please Enter a Number : ");
		int num = scan.nextInt();
		// checking the number is divisible by 2 or not
		if(num % 2 == 0) {
			System.out.println("The number "+num+" is Even Number");
		}else {
			System.out.println("The number "+num+" is Odd Number");
		}
		// release resources 
		scan.close();
	}

}
