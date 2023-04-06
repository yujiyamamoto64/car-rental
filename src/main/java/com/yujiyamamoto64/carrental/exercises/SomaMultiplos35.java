package com.yujiyamamoto64.carrental.exercises;

public class SomaMultiplos35 {

	public static int calculoSomaMultiplosDe3e5(Integer n) {
		
		int result = 0;
		int m3 = (n-1) / 3;
		int m5 = (n-1) / 5;
		
		for (int i = 1; i <= m3; i++) {
			result = result + 3 * i;
		}
		
		for (int i = 1; i <= m5; i++) {
			result = result + 5 * i;
		}
		
		return result;
	}
}
