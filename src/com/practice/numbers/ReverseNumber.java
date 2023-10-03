package com.practice.numbers;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// taking inputs from the user
		System.out.println("please enter a number : ");
		int num = scan.nextInt();
		int rem=0,rev=0;
		// checking if the enter number is greater than 0
		while(num > 0) {
			// get last number by using modulus operation with 10
			rem = num % 10;
			// multiply with 10 and adding the remainder value
			rev = rev * 10 + rem;
			// removing the last number from the digits
			num = num/10;
		}
		System.out.println(rev);
		// releasing resources
		scan.close();
	}

}
