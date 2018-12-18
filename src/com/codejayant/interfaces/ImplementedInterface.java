package com.codejayant.interfaces;

public class ImplementedInterface implements InterfaceExample {

	@Override
	public void display() {
		System.out.println("ImplementedInterface.display");
	}

	@Override
	public void printAgain()	{
		System.out.println("ImplementedInterface.printAgain");
	}
}
