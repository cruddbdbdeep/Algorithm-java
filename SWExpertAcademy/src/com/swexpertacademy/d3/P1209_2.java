package com.swexpertacademy.d3;

/*
 * 2018-11-02
 * P1209. [S/W 문제해결 기본] 2일차 - Sum
 * @input	: T1
 * 			  n1 n2 ... n100
 * 			  n1 n2 ... n100
 * 			  ...
 * 			  n1 n2 ... n100
 * @output	: #1 sum(in row, col, diagonal)
*/

import java.util.Scanner;

public class P1209_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			
			int testCase = sc.nextInt();
			int[][] numArr = new int[100][100];
			int total_1 = 0;
			int total_2 = 0;
			int max = 0;
			
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					numArr[i][j] = sc.nextInt();
				}
			}
			
			// check row, col
			for(int i=0; i<100; i++) {
				total_1 = 0;
				total_2 = 0;
				for(int j=0; j<100; j++) {
					total_1 += numArr[i][j];
					total_2 += numArr[j][i];
				}
				max = Math.max(Math.max(total_1, total_2), max);
			}
			
			// check diagonal
			total_1 = 0;
			total_2 = 0;
			for(int i=0; i<100; i++) {
				total_1 += numArr[i][i];
				total_2 += numArr[99-i][i];
			}
			max = Math.max(max, Math.max(total_1, total_2));
			
			System.out.printf("#%d %d\n", testCase, max);
		}
		
		sc.close();
		
	}

}
