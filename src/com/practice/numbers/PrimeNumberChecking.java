package com.practice.numbers;

import java.util.Scanner;

public class PrimeNumberChecking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// taking input from the user
		System.out.println("Please enter the number : ");
		int num = scan.nextInt();
		// taking count variable and a for loop to check the number is divisible with how many numbers
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num % i == 0) {
				count++;
			}
		}
		// if the number is completely divisible with 1 and itself i,e(count ==2 ) then it is prime
		if(count == 2) {
			System.out.println("The number "+num+" is Prime Number");
		}else {
			System.out.println("The number "+num+" is not a Prime Number");
		}
		// releasing resources
		scan.close();
	}

}
