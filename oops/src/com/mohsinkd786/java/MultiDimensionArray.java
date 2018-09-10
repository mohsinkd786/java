package com.mohsinkd786.java;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// 2 d array
		// java doesn't really have multidimensional arrays
		// however we can define array of arrays
		int[][] values = { { 1, 2 }, { 3, 4 } };
		// accessing a field
		// shall print 1 : first value of first array
		System.out.println(values[0][0]);
		// shall print 4
		System.out.println(values[1][1]);
		// 3 d array
		String[][][] messages = { { { "Hello", "How" }, { "Hola", "Are" } }, { { "Hey", "You" }, { "Hoy", "Mate" } } };
		// shall print You
		// second element of outer array -> first element of the inner array ->
		// second element of inner-most array
		System.out.println(messages[1][0][1]);
	}
}
