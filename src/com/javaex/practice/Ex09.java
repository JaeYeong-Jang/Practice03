package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		
		int k = 0;
		int h = 1;
		
		for ( int i = 0; i < 10; i++) {

			for( int j = 0; j < 10; j++) {
				
				k = k +1;
				System.out.print(k + "\t");
			}
			k = h++;
			System.out.println();
		}

	}

}
