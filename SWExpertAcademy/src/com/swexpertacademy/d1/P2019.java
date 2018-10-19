package com.swexpertacademy.d1;

/*
 * 2018-10-09
 * P2019. 더블더블
 * @input	: n
 * @output	: 2^0 2^1 ... 2^n
 * @use		: Math.pow(밑, 지수) - 제곱 함수
*/

import java.util.Scanner;


public class P2019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0; i<=num; i++) {
			double ans = Math.pow(2, i);
			System.out.print((int)ans + " ");
		}
		
		sc.close();
	}

}
