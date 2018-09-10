package com.mohsinkd786.java;

/*
 * Classes are Templates that define a representation of an Entity 
 * Class can contain Members
 * 1: Methods/ Function : block of executable Code
 * 2: Variables: Storage Units / Containers
 * The attributes of a class can be accessed via
 * 1: Static : Specific Block that preserves a unique representation in Java's Memory,
 * and is always entitled to be loaded first and only referred as a single copy across a class,
 * hence will always be referred via Class Name
 * 2: Instance : Object is a representation of the class to access the attributes 
 * associated with a class
 * */

// NOTE : Class defined in it own file shall bear the same name as the file 
// and be declared public so others can access it ,except for special cases
public class Super {

	// Standard :
	// Classes follow PascalCasing
	// Methods follow camelCasing
	// Class members can be accessed,based on the access specified for them

	// Access Specifiers
	// private : shall be limited only within the class that declared it
	// protected : shall be accessible with all the inheriting classes as their
	// own
	// default : shall be accessible to all the classes with the same package
	// public: shall be available to everyone
	// static : This is a special keyword reserved to define static members
	// ,hence shall always be associated with one of the above specifiers

	static {
		// static block, first one to get executed
		// executes once in the lifetime of a class
	}
	{
		// instance block, first one that gets executed everytime the class is
		// instantiated
	}

	int index;
	static String message;

	Super() {
		// overridden no argument constructor

	}

	Super(int num) {
		// overridden parameterized constructor
		// useful for initializing variables at the time of object creation ,
		// primarily useful for mandatory fields
		index = num;
	}

	// method signature
	// parameters : 0 or more
	// return : void if it doesn't return anything else the type of data that's
	// being returned
	// access : private / protected / public / default
	// class level : static or non static( only accessible via Object)
	// final : restricted to be overridden in child class
	void hello() {
		// This method shall be available to all classes within this package
		// default access specifier is considered for all the members with no
		// explicit specifier
		System.out.println("hello() in Super Class " + index);
	}

	final void sum(int i, int j) {
		System.out.println("sum() in Super Class " + (i + j));
	}

	void hey() {
		System.out.println("hey() in Super Class ");
	}

	static void printMessage() {
		System.out.println("printMessage() in Super Class " + message);
	}

	public static void main(String args[]) {

		// access members of a class
		// Way 1: In case non static
		// Create Object
		// Left : Super sup : is the reference variable
		// Right : new Super() : refers to the default constructor for the class
		// to instantiate it
		Super sup = new Super();
		// access the members
		sup.hello();
		sup.index = 10;
		// value of index = 10 shall remain till sup (object of Super class)
		// exists

		// Way 2: In case of static members
		// Access with Class Name

		// Static variable shall sustain the same value till the application
		// hasn't been stopped
		Super.message = "Hello";
		// Calling Static method , no need to define objects can be accessed
		// directly with the class name
		Super.printMessage();
		// Flow of execution
		// 1. static
		// 2. non static

		// parameterized constructor
		Super supp = new Super(15);
		supp.hello();
	}
}
