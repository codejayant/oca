package com.codejayant.functions;

import java.util.function.Predicate;

public class PredicateExample {



	public static void main(String[] args) {

		String name = "jayant";

		Predicate<String> greaterThanFive = s -> s.length() > 5;

		System.out.println(greaterThanFive.test(name));

		Predicate<String> lessThanTwenty = s -> s.length() < 20;

		System.out.println(lessThanTwenty.test(name));

		System.out.println(greaterThanFive.and(lessThanTwenty).test("jay"));

		System.out.println(greaterThanFive.and(lessThanTwenty).negate().test("jay"));

	}

}
