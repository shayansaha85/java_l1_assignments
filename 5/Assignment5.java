package com.assignment5;

public class Assignment5 {
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		if(age>=18 && age<=60) {
			System.out.println("Correct input");
		} else {
			try {
				throw new InvalidAgeException();
			} catch(InvalidAgeException ex) {
				ex.printStackTrace();
			}
		}
	}
}
