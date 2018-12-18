package com.codejayant.codeflow;

@SuppressWarnings("ClassInitializerMayBeStatic")
class Parent {
	static {
		System.out.println("Parent: Static block");
	}
	{
		System.out.println("Parent: block");
	}
	Parent()	{
		System.out.println("Parent: constructor");
	}
}

@SuppressWarnings("ClassInitializerMayBeStatic")
class Child extends Parent {
	static {
		System.out.println("Child: Static block");
	}
	{
		System.out.println("Child: block");
	}
	Child()	{
		System.out.println("Child: constructor");
	}
}

@SuppressWarnings( { "ClassInitializerMayBeStatic", "unused" }) public class CodeFlow {

	private CodeFlow()	{
		System.out.println("CodeFlow: constructor");
	}

	static {
		System.out.println("CodeFlow: static block");
	}

	{
		System.out.println("CodeFlow: block");
	}

	public static void main(String[] args) {
		{
			System.out.println("CodeFlow: block inside main before");
		}



		System.out.println("CodeFlow: main print");

		{
			System.out.println("CodeFlow: block inside main after");
		}

//		CodeFlow codeFlow = new CodeFlow();


		System.out.println("==========================");
		Parent pc = new Child();
		Child c = new Child();


		// All Initialization blocks are called in order whenever class in initialized and before constructors are invoked.

		// Static block is called only once for the first time

	}
	{
		System.out.println("CodeFlow: Block at End");
	}
}
