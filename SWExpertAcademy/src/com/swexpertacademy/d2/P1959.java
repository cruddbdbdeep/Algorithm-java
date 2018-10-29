package com.swexpertacademy.d2;

/*
 * 2018-10-25
 * P1959. 두 개의 숫자열
 * @input	: T
 * 			  n m
 * 			  nArr
 * 			  mArr
 * @output	: #1 nArr[0]*mArr[0]+...+nArr[n]*mArr[n] (if n<m, total_max)
*/

import java.util.Scanner;

public class P1959 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] nArr = new int[n];
			int[] mArr = new int[m];

			for(int j=0; j<n; j++) {
				nArr[j] = sc.nextInt();
			}
			
			for(int j=0; j<m; j++) {
				mArr[j] = sc.nextInt();
			}
			
			int max = 0;
			int total;
			
			if(n<m) {
				for(int j=0; j<m-n+1; j++) {
					total = 0;
					for(int k=0; k<n; k++) {
						total += nArr[k]*mArr[j+k];
					}
					max = (total>max)? total:max;
				}
			} else {
				for(int j=0; j<n-m+1; j++) {
					total = 0;
					for(int k=0; k<m; k++) {
						total += nArr[j+k]*mArr[k];
					}
					max = (total>max)? total:max;
				}
			}
			
			System.out.printf("#%d %d", i+1, max);
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
