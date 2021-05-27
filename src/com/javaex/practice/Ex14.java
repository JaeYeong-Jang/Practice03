package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		int i_num = sc.nextInt();
		
		for ( int i = 1; i <= i_num; i++) {
			if (i == i_num ) {
				System.out.print(i);
				sum += i;
			}else {
			System.out.print(i + "+"); // 마지막 + 기호 빼기 (?)
			sum += i;}
		}
		System.out.println();
		System.out.println("합계 : " + sum);
		
		sc.close();
		

	}

}
