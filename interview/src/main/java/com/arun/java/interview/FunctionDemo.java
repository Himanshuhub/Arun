package com.arun.java.interview;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		square();
	}

	private static void square() {
		Function<Integer, Integer> squareIt = n -> n* n;		
		System.out.println(squareIt.apply(10));
	}
}