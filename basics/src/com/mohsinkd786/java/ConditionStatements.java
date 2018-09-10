package com.mohsinkd786.java;

public class ConditionStatements {

	public static void main(String[] args) {
		// primitive variables i.e. inherited from C/ C++
		// int , char, float , double , long, short

		// variable declaration
		// data type for storage & name of variable
		int index = 10;
		System.out.println(index); // will print 10 in console

		// conditional statements -> if /else
		// logical operators -> ||(OR) / && (and) / == (equal to) / != (not
		// equal to)

		if (index > 5) {
			// + can be used as concatenation operator within strings
			System.out.println("Index is greater than 5 " + index);
		} else if (index < 5)
			// conditional statements can be single liner or multi liner
			// singular statements can be applied without braces
			System.out.println("Index is lesser than 5 " + index);
		else {
			// will get executed , in case none of the specified conditions are
			// met
			// as per above this will never be executed
		}
	}
}
