package com.practice.numbers;

import java.util.Scanner;

public class PrimeNumbersRange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the starting number : ");
		int startNum = scan.nextInt();
		System.out.println("Enter the ending number : ");
		int endNumber = scan.nextInt();
		for(int i = startNum;i<=endNumber;i++) {
			int count =0;
			for(int j=1;j<=endNumber;j++) {
				if(i%j==0) {
					count++;
				}		
			}
			if(count == 2) {
				System.out.println(i);
			}
		}
		scan.close();
	}
}
