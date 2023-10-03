package com.practice.numbers;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// taking number from the user
		System.out.println("Please enter the number : ");
		int num = scan.nextInt();
		// assign palindrome method to boolean data type 
		boolean isPalindrome = palindrome(num);
		if(isPalindrome) {
			System.out.println("Number "+num+" is Palindrome");
		}else {
			System.out.println("Number "+num+" is not a Palindrome");
		}
		scan.close();
	}

	public static boolean palindrome(int num) {
		boolean ispalindrome = true;
		int rem,rev = 0;
		// assign the enter number to the temporary  variable
		int temp = num;
		while(num > 0) {
			// getting last number from the digits
			rem = num%10;
			// assign the last value to first using the multiply with 10 and adding remainder
			rev = (rev*10)+rem;
			// removing last number from the digits
			num =num/10;
		}
		// checking temporary number with reverse number. if same then palindrome
		if(temp == rev) {
			return ispalindrome;
		}else {
			return false;
		}
	}
	

}
