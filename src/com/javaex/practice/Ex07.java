package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int i_num = sc.nextInt();
		int num;
		int p_count;
		
		for ( num = 1; num <= i_num; num++) {
			for ( p_count = 0; p_count < num; p_count++) {
				System.out.print(num);
			}
			System.out.println();
		}
		
		
		sc.close();
		

	}

}
