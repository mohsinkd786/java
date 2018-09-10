package com.mohsinkd786.java;

public class SwitchStatements {

	public static void main(String[] args) {

		int index = 15;

		// alternate of if / else
		// case specify the matching condition
		// continue unless broken out of a case with break statement
		// break statement is used to cease any further execution for that flow
		switch (index) {
		case 10:
			// will execute when index = 10
			System.out.println("Index is " + index);
			break;
		case 1:
		case 2:
		case 7:
			// will execute when index = 1 or 2 or 7
			System.out.println("Index is " + index);
			break;
		default:
			// will execute in case none of the condition is satisfied
			System.out.println("Default Condition " + index);
		}
	}
}
