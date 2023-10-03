package com.practice.numbers;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the Year : ");
		int year = scan.nextInt();
		if((year%400==0) || (year%4==0 && year % 100 !=0)) {
			System.out.println("The "+year+" is Leap Year");
		}else {
			System.out.println("Year "+year+" not a Leap Year");
		}
		scan.close();
	}

}
