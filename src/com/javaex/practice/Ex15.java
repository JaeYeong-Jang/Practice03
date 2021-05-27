package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int i_num = sc.nextInt();
		
		for ( int i = 1; i <= i_num; i++) {
			if(i_num % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
