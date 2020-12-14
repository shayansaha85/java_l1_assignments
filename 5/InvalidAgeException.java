package com.assignment5;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception {
	

	public String toString() {
		return "Enter age between 18-60";
	}
}
