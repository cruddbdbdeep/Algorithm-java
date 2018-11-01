package com.swexpertacademy.d2;

/*
 * 2018-11-01
 * P1984. 중간 평균값 구하기
 * @input	: T
 * 			  n1 n2 n3 n4 n5 n6 n7 n8 n9 n10
 * @output	: #1 (n2+n3+...+n8+n9)/8.0
 * @use		: Math.round(double) - 반올림
*/

import java.util.Arrays;
import java.util.Scanner;

public class P1984 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			int[] numArr = new int[10];
			int total = 0;
			
			for(int j=0; j<10; j++) {
				numArr[j] = sc.nextInt();
			}
			
			Arrays.sort(numArr);
			
			for(int j=0; j<10; j++) {
				if(j==0 || j==9) continue;
				total += numArr[j];
			}
			
			System.out.printf("#%d %d ", i+1, Math.round(total/8.0));
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
