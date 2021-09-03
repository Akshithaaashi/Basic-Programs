package com.basiccoreprograms;

import java.util.Scanner;

public class VowelOrConstant {
	public static void main(String[] args) {

		char charcter;

		System.out.println("Enter The Word :-");
		Scanner SC = new Scanner(System.in);
		char charcter1 = SC.next().charAt(0);

		if (charcter1 == 'a' || charcter1 == 'e' || charcter1 == 'i' || charcter1 == 'o' || charcter1 == 'u')
			System.out.println(charcter1 + " Is Vowel");
		else
			System.out.println(charcter1 + " Is Consonant");

	}
}
