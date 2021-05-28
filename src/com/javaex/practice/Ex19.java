package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a=0;;

		int rem = 0;
		
		while (a != 4) {
		System.out.println("---------------------------------");
		System.out.println("1.예금  | 2.출금  | 3.잔고  | 4.종료  ");
		System.out.println("---------------------------------");
		System.out.print("선택>");
		int sel_num = sc.nextInt();
		
			switch ( sel_num ) {
			case 1: System.out.print("예금액>");
			int i_m = sc.nextInt();
			rem += i_m;
			break;
			
			case 2: System.out.print("출금액>");
			int o_m = sc.nextInt();
			rem -= o_m;
			break;
			
			case 3: System.out.print("잔고액>");
			System.out.println(rem);
			break;
			
			case 4: System.out.print("프로그램 종료");
			break;
			
			default : System.out.print("다시 입력해주세요.");
			break;
			
			}
			
			a = sel_num;
		
		}
		sc.close();
	}

}
