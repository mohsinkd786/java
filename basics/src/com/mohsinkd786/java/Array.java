package com.mohsinkd786.java;

public class Array {

	public static void main(String[] args) {

		// Array is a group of values with similar data type

		// array of type integers
		// declaration
		// Way 1
		// Left : name & definition
		// Right : instantiation & size of array
		int[] vals = new int[3];
		// array values can be accessed using the index starting with 0
		vals[0] = 1;
		vals[1] = 2;
		vals[2] = 3;
		// will print 1
		System.out.println(vals[0]);
		// Way 2
		// Left : name & definition
		// Right : assign values
		String[] strs = { "Hello", "How", "r u" };
		// will print Hello
		System.out.println(strs[1]);

	}
}
