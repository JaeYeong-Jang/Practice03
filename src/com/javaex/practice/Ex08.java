package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		int dan;
		int times;

		for( times = 1; times <= 9 ; times++) {
			for( dan = 2; dan <= 9 ; dan++) {
				System.out.print(dan + "*" + times + "=" + dan*times + "  ");
			}
			System.out.println();
		}
		
		

	}

}
