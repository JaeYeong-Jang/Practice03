package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fac = 1;
		
		System.out.println("숫자를 입력하세요.");
		int i_num = sc.nextInt();
		
		for( int i = 1; i <= i_num; i++) {
			fac = fac * i;
		}
		System.out.println("결과값 : " + fac);
		
		sc.close();
		

	}

}
