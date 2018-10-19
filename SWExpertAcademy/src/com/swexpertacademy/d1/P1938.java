package com.swexpertacademy.d1;

/*
 * 2018-10-09
 * P1938. 아주 간단한 계산기
 * @input	: a b
 * @output	: a+b
 * 			  a-b
 * 			  a*b
 * 			  a/b
*/

import java.util.Scanner;

public class P1938 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		sc.close();
	}

}
