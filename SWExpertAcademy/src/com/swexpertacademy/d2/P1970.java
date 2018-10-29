package com.swexpertacademy.d2;

/*
 * 2018-10-29
 * P1970. 쉬운 거스름돈
 * @input	: T
 * 			  money
 * @output	: #1 50000 10000 5000 1000 500 100 50 10 (필요한 개수)
*/

import java.util.Scanner;

public class P1970 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		int[] change = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		for(int i=0; i<testCase; i++) {
			
			int money = sc.nextInt();
			int[] moneyCnt = new int[8];
			for(int j=0; j<8; j++) {
				if(money>=change[j]) {
					int temp = money/change[j];
					money -= temp*change[j];
					moneyCnt[j] = temp;
				}
			}
			
			System.out.printf("#%d", i+1);
			System.out.println();
			for(int cnt : moneyCnt) {
				System.out.print(cnt + " ");
			}
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
