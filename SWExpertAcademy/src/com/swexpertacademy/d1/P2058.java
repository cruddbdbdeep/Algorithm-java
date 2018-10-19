package com.swexpertacademy.d1;

/*
 * 2018-10-18
 * P2058. 자릿수 더하기
 * @input	: abcd
 * @output	: a+b+c+d
*/

import java.util.Scanner;

public class P2058 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int total = 0;
		while(num>0) {
			int digit = num%10;
			total += digit;
			num = num/10;
		}
		
		System.out.println(total);
		
		sc.close();
		
	}

}
