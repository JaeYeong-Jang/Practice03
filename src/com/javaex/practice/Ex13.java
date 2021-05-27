package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		int i_num = sc.nextInt();
		
		for ( int i = 1; i <= i_num; i++) {
			sum += i;
		}
		
		System.out.println("합계 : " + sum);
		
		
		sc.close();

	}

}
