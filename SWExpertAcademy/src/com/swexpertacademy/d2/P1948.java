package com.swexpertacademy.d2;

/*
 * 2018-10-24
 * P1948. 날짜 계산기
 * @input	: T
 * 			  firstMonth firstDay nextMonth nextDay
 * @output	: #1 nextTotalDay-firstTotalDay
*/

import java.util.Scanner;

public class P1948 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		int[] monthDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i=0; i<testCase; i++) {
			
			int firstMon, firstDay, nextMon, nextDay;
			firstMon = sc.nextInt();
			firstDay = sc.nextInt();
			nextMon = sc.nextInt();
			nextDay = sc.nextInt();
			
			for(int j=0; j<firstMon; j++) {
				firstDay += monthDay[j];
			}
			
			for(int j=0; j<nextMon; j++) {
				nextDay += monthDay[j];
			}
			
			int cnt = nextDay-firstDay+1;
			
			System.out.printf("#%d %d", i+1, cnt);
			System.out.println();
		}
		
		sc.close();
		
	}

}
