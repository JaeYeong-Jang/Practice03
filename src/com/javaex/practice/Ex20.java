package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		
		
		
		while ( b != 0 ) {
			
			double rand_num = Math.random();
			int int_rand_num = (int)(rand_num * 101);
			
			System.out.println("=====================");
			System.out.println("  [숫자맞추기게임 시작]  ");
			System.out.println("=====================");
			
			while(a !=int_rand_num ) {
				
				System.out.print(">>");
				int i_num = sc.nextInt();
				
				a = i_num;
				
				if(i_num == int_rand_num) {
					System.out.println("맞았습니다.");
				}
				else if( i_num > int_rand_num) {
					System.out.println("Down");
				}else{
					System.out.println("Up");
				}
			}
			System.out.print("게임을 종료하시겠습니까?(y/n) >>");
			char re_A = sc.next().charAt(0);
			if (re_A == 'n') {
				b = 1;
				a = 0;
			}else {
				b = 0;
			}
			
			
		}sc.close();
		System.out.println("=====================");
		System.out.println("  [숫자맞추기게임 종료]  ");
		System.out.println("=====================");
	}

}
