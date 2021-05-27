package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("숫자를 입력하세요.");
		int i_num = sc.nextInt();
		
		if ( i_num % 2 == 0 ) {
			for( int i = 0; i <= i_num; i += 2 ) {
				sum += i;
			}System.out.println("결과값 : " + sum);
		}else {
			for( int i = 1; i <= i_num; i += 2 ) {
				sum += i;
			}System.out.println("결과값 : " + sum);
		}
		
		sc.close();

	}

}
