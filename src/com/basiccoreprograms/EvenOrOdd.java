package com.basiccoreprograms;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		int i;
		System.out.println("Enter the number :-");
		Scanner SC = new Scanner(System.in);
		i = SC.nextInt();

		if (i % 2 == 0)
			System.out.println(i + " Even Number ");
		else
			System.out.println(i + " Odd Number ");

	}

}
