package com.basiccoreprograms;

public class SwapTwoNumbers {
	public static void main(String[] args) {

		int first = 100, second = 200;

		int temporary = first;
		first = second;
		second = temporary;

		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
	}
}
