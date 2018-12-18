package com.codejayant.interfaces;

@FunctionalInterface
public interface InterfaceExample {

	void display();

	static String print()	{
		System.out.println("InterfaceExample.print");
		return "completed.";
	};

	default void printAgain() {
		System.out.println("InterfaceExample.printAgain");
	}

	default void printAgain1() {
		System.out.println("InterfaceExample.printAgain");
	}

}
