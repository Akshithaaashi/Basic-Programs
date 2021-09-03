package com.basiccoreprograms;


import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
        int num;
        double result = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();

        while (num > 0 ) {
            result = result + (double) 1/num;
            num--;
            System.out.println(result+ ",");
		}
	}
}