package com.yujiyamamoto64.carrental.exercises;

public class Fatorial {

	public static int calculoFatorial(Integer n) {

		int fatorial = 1;
		for (int i = 1; i < n + 1; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
}
