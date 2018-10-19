package com.swexpertacademy.d1;

/*
 * 2018-10-19
 * P2072. 홀수만 더하기
 * @input	: T
 * 			  num1 num2 ... num9 num10
 * @output	: num1+num3+...+num9 (if num//2!=0)
*/

import java.util.Scanner;

public class P2072 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			int total = 0;
			for(int j=0; j<10; j++) {
				int num = sc.nextInt();
				if(num%2!=0) {
					total += num;
				}
			}
			System.out.printf("#%d %d", i+1, total);
			System.out.println();
		}
		
		sc.close();
		
	}

}
