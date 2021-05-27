package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int i_num = sc.nextInt();
		
		int q = i_num;
		
		
		for ( int i = 0; i < i_num; i++) {
			for (int j = q; j > 0; j--) {
				System.out.print("*");
			}
			q--;
			System.out.println();
		}
		
		
		
		
		
		sc.close();
		
	}

}
