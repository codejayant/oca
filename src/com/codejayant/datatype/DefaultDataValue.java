package com.codejayant.datatype;

public class DefaultDataValue {

	int defaultPrimitiveInteger;
	float defaultPrimitiveFloat;
	double defaultPrimitiveDouble;
	long defaultPrimitiveLong;
	byte defaultPrimitiveByte;
	boolean defaultPrimitiveBoolean;

	String defaultStringObject;
	Integer defaultIntegerObject;
	Float defaultFloatObject;
	Double defaultDoubleObject;
	Long defaultLongObject;
	Byte defaultByteObject;
	Boolean defaultBooleanObject;

	public static void main(String[] args) {

		DefaultDataValue a = new DefaultDataValue();

		System.out.println("defaultPrimitiveInteger: " + a.defaultPrimitiveInteger);
		System.out.println("defaultPrimitiveFloat: " + a.defaultPrimitiveFloat);
		System.out.println("defaultPrimitiveDouble: " + a.defaultPrimitiveDouble);
		System.out.println("defaultPrimitiveLong: " + a.defaultPrimitiveLong);
		System.out.println("defaultPrimitiveByte: " + a.defaultPrimitiveByte);
		System.out.println("defaultPrimitiveBoolean: " + a.defaultPrimitiveBoolean);


		System.out.println("defaultStringObject: " + a.defaultStringObject);
		System.out.println("defaultIntegerObject: " + a.defaultIntegerObject);
		System.out.println("defaultFloatObject: " + a.defaultFloatObject);
		System.out.println("defaultDoubleObject: " + a.defaultDoubleObject);
		System.out.println("defaultLongObject: " + a.defaultLongObject);
		System.out.println("defaultByteObject: " + a.defaultByteObject);
		System.out.println("defaultBooleanObject: " + a.defaultBooleanObject);

		int x = 0;
		Integer xy = null;
		System.out.println(x);
		System.out.println(xy);

		Boolean b = null;
		System.out.println(b);


		// instance variable has default value.
		// method variable dooe not have default value. Need to initialize with value before using.
		// static variable is not allowed in the method.


	}
}
