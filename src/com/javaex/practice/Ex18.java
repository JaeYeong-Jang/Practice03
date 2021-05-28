package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int i_num = sc.nextInt();
		
		int q = i_num;
		int j;
		int i;
		
		for ( i = 0; i < i_num; i++) {
			for ( j = q; j > 0; j--) {
				System.out.print("*");
			}
			q--;
			if( q <= 1 ) {
				for( i = 0; i < i_num+1; i++) {
					for( j = 0; j < i; j++) {
						System.out.print("*");
					}System.out.println();
				}
			}
			System.out.println();	
		}
		
		sc.close();
		
	}

}
