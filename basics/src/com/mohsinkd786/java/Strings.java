package com.mohsinkd786.java;

public class Strings {

	public static void main(String[] args) {

		// String is a specific data type built in Java
		// Its immutable i.e. it will create a new copy of the variable
		// everytime we modify it

		String message;
		// Way 1 : to create strings defines in specific storage structure
		// referred as STRING POOL
		message = "Hello";
		// this will create a new message variable after re initialization
		message = "Hello how r u";
		// Way 2: Creates a conventional object
		String message1 = new String("Hello how r u");

		System.out.println(message);
		System.out.println(message1);

		if (message == message1) {
			// This condition isn't true
			// because == compares the values based on type of objects created
			System.out.println("Strings are equal");
		}
		if (message.equals(message1)) {
			// This condition will be true
			// because equals compares the values / content in a String
			System.out.println("Strings are equal with equals() method");
		}

		String message2 = message1.intern();
		if (message == message2) {
			// This condition is true
			// because == compares the values based on type of objects created
			// intern() moves the String to String Pool since message was
			// created in string pool & now message2 has been moved to String
			// pool
			System.out.println("Strings are equal after moved to String Pool");
		}
		// get a character from the string using the index
		System.out.println(message.charAt(0));

		// Methods in String
		// creates a substring of the actual string
		message = message.substring(0, 2);
		System.out.println(message);

		// join 2 strings together
		message = message.join(message1);
		System.out.println(message);

	}
}
