package com.mohsinkd786.java;

import java.util.Arrays;

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
		String[] strs = { "Hoy", "Hey", "r u" };
		// will print Hey
		System.out.println(strs[1]);
		// Sorting an Array
		Arrays.sort(strs);
		// after sorting the array
		// values should be re ordered based on the alphabetical order
		System.out.println(strs[1]);

		double[] values = { 1.0, 1.1, 1.2 };
		// creating new array from old array
		double[] new_values = values;
		System.out.println(new_values[2]);
	}
}
