package com.basiccoreprograms;
import java.util.Scanner;

public class PowerOf2 {
	
		public static void Square() {
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER A NUMBER :-  ");
			int num = sc.nextInt();
			int i;
			int answer;
			for (i = 0; i <= num; i++) {
				answer = (int) (Math.pow(i, 2));

				System.out.println("THE SQUARE OF " + i + " IS ---- " + answer);
			}
		}

		public static void main(String[] args) {
			PowerOf2 power = new PowerOf2();
			power.Square();
		}

}
