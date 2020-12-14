package com.assignment1;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		System.out.println(number+"! = "+factorial(number));
		sc.close();
	}
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		} else if(n==1) {
			return 1;
		} else {
			return n*factorial(n-1);
		}
	}

}
