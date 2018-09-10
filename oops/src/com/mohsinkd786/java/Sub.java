package com.mohsinkd786.java;

public class Sub extends Super {

	// Inheritance : Java supports multi-level inheritance not multiple
	// inheritance when it comes to classes
	// Here
	// parent : Super
	// child : Sub
	//
	// Child Inherits properties from his Parent in addition to its own

	void add() {
		System.out.println("add() in Sub Class");
	}

	int index;

	@Override
	void hey() {
		// in order to invoke hey() from Super class use super keyword
		super.hey();
		// invokes index variable in Super class
		super.index = 10;
		// use this keyword to refer to the current class instance
		// refers to index variable in Sub class
		// i.e. we will have 2 copies of index variable
		this.index = 13;
		System.out.println("hey() in Sub Class ");
	}

	// void sum(int i, int j) {
	// System.out.println("sum() in Sub Class " + (i + j));
	// }
	public static void main(String[] args) {
		Sub sub = new Sub();
		// The hello() from Super gets inherited into Sub class
		sub.hello();
		// child class method
		sub.add();
		// parent class static members are accessible via sub class name as it's
		// own
		Sub.printMessage();
		// sub cannot override sum method since it's being declared final i.e.
		// its prohibited from being overridden
		sub.sum(10, 2);
		// shall call overridden hey() in Sub class
		sub.hey();

	}
}
