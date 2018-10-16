package com.swexpertacademy.d1;

/*
 * 2018-10-09
 * P2019. 더블더블
 * 1부터 주어진 횟수까지 2를 곱한 값(들)을 출력하시오.
 * 주어질 숫자는 30을 넘지 않는다.
 * @input	: n
 * @output	: 2^0 2^1 ... 2^n
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
