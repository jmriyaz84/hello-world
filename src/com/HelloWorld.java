package com;

import java.util.stream.IntStream;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Welcome to DevOps");
		IntStream.range(1,11).forEach(System.out::println);
	}
}
