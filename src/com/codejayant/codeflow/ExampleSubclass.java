package com.codejayant.codeflow;

@SuppressWarnings("ClassInitializerMayBeStatic")
class Example {

	static {
		step(1);
	}

	@SuppressWarnings("unused")
	public static int step_1 = step(2);

	@SuppressWarnings("unused")
	public int step_6 = step(6);

	Example() {
		step(8);
	}

	{
		step(7);
	}

	// Just for demonstration purposes:
	static int step(int step) {
		System.out.println("Step " + step);
		return step;
	}
}

@SuppressWarnings("ClassInitializerMayBeStatic")
public class ExampleSubclass extends Example {

	{
		step(9);
	}

	@SuppressWarnings("unused")
	public static int step_3 = step(3);

	@SuppressWarnings("unused")
	public int step_10 = step(10);

	static {
		step(4);
	}

	private ExampleSubclass() {
		step(11);
	}

	public static void main(String[] args) {
		step(5);
		new ExampleSubclass();
		step(12);
	}
}