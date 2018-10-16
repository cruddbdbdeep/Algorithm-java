package com.swexpertacademy.d1;

/*
 * 2018-10-09
 * P1545. 거꾸로 출력해 보아요
 * 주어진 숫자부터 0까지 순서대로 찍어보세요
 * @input	: n
 * @output	: n n-1 ... 0
*/

import java.util.Scanner;

public class P1545 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=num; i>=0; i--) {
			System.out.print(i + " ");
		}
		
		sc.close();
		
	}

}
