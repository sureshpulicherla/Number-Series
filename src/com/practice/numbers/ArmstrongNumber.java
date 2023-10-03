package com.practice.numbers;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// taking inputs from the user
		System.out.println("Please enter a number : ");
		int num = scan.nextInt();
		// assigning the boolean method value to boolean variable
		boolean res = isArmStrong(num);
		// if true then Armstrong number
		if(res) {
			System.out.println("Number "+num+" is Armstrong Number");
		}else {
			System.out.println("Number "+num+" is not an Armstrong Number");
		}
		scan.close();
	}
	static boolean isArmStrong(int num) {
		boolean armstrongNumber = true;
		int length =0,temp1 = num;
		// getting the overall digits in the number i,e.(length)
		while(temp1 != 0) {
			length = length + 1;
			temp1 = temp1/10;
		}
		// to get reverse of a number and multiply with number of length
		int temp2 = num;
		int armStrong=0,rem;
		while(temp2 != 0) {
			int multiply=1;
			// getting last digit of a number
			rem = temp2 %10;
			// traversing and multiply the digits with equal length
			for(int i=1;i<=length;i++) {
				multiply = multiply * rem;
			}
			// adding the multiply value to the armStrong variable
			armStrong += multiply;
			temp2 /=10;
		}
		// checking the getting value is similar to the enter number
		if(armStrong == num) {
			return armstrongNumber;
		}else {
			return false;
		}
	}

}
