package com.swexpertacademy.d3;

/*
 * 2018-11-02
 * P1206. [S/W 문제해결 기본] 1일차 - View
 * @input	: T1
 * 			  n1 n2 ... nT1
 * 			  T2
 * 			  n1 n2 ... nT2
 * @output	: #1 n3-max(n1, n2, n4, n5) 
 * 			  #2 n3-max(n1, n2, n4, n5)
*/

import java.util.Scanner;

public class P1206 {
	
	static int find_max(int a, int b, int c, int d) {
		int max = 0;
		int[] numArr = {a, b, c, d};
		
		for(int i=0; i<4; i++) {
			if(numArr[i]>max) {
				max = numArr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			int testCase = sc.nextInt();
			int[] apartArr = new int[testCase];
			int answer = 0;
			
			for(int i=0; i<testCase; i++) {
				apartArr[i] = sc.nextInt();
			}
			
			for(int i=2; i<testCase-2; i++) {
				if(apartArr[i]>apartArr[i-2] && apartArr[i]>apartArr[i-1]) {
					if(apartArr[i]>apartArr[i+2] && apartArr[i]>apartArr[i+1]) {
						int temp = find_max(apartArr[i-2], apartArr[i-1], apartArr[i+1], apartArr[i+2]);
						answer += apartArr[i]-temp;
					}
				}
			}
			
			System.out.printf("#%d %d\n", t, answer);
		}
	}
}
