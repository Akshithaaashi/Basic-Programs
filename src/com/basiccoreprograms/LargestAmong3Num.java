package com.basiccoreprograms;

import java.util.Scanner;

public class LargestAmong3Num {
	public static void main(String[] args) {
		int firstNo, secondNo, thirdNo;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number:");
		firstNo = s.nextInt();
		System.out.print("Enter the second number:");
		secondNo = s.nextInt();
		System.out.print("Enter the third number:");
		thirdNo = s.nextInt();
		if (firstNo > secondNo && firstNo > thirdNo) {
			System.out.println("Largest number is:" + firstNo);
		} else if (secondNo > thirdNo) {
			System.out.println("Largest number is:" + secondNo);
		} else {
			System.out.println("The Largest Number From Above Entered Three Number Is:" + thirdNo);
		}

	}
}
