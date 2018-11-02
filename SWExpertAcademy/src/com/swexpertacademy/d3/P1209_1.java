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

public class P1209_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			
			int testCase = sc.nextInt();
			int[][] numArr = new int[100][100];
			int total = 0;
			int max = 0;
			
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					numArr[i][j] = sc.nextInt();
				}
			}
			
			// check row
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					total += numArr[i][j];
				}
				if(total>max) max=total;
				total = 0;
			}
			
			// check col
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					total += numArr[j][i];
				}
				if(total>max) max=total;
				total = 0;
			}
			
			// check right diagonal
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					if(i==j) total += numArr[j][i];
				}
			}
			if(total>max) max=total;
			total = 0;
			
			// check left diagonal
			for(int i=0; i<100; i++) {
				for(int j=0; j<100; j++) {
					if(i+j==99) total += numArr[j][i];
				}
			}
			if(total>max) max=total;
			total = 0;
			
			System.out.printf("#%d %d\n", testCase, max);
		}
		
		sc.close();
		
	}

}
