package com.swexpertacademy.d2;

/*
 * 2018-11-01
 * P2001. ÆÄ¸® ÅðÄ¡
 * @input	: T
 * 			  n m
 * 			  a1 a2 ... an
 * 			  b1 b2 ... bn
 * 			  ...
 * 			  n1 n2 ... nn
 * @output	: #1 max_total(mXm)
*/

import java.util.Scanner;

public class P2001 {
	
	static int check(int m, int row, int col, int[][] flyArr) {
		int total = 0;
		for(int i=row; i<row+m; i++) {
			for(int j=col; j<col+m; j++) {
				total += flyArr[i][j];
			}
		}
		return total;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] flyArr = new int[n][n];
			
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					flyArr[j][k] = sc.nextInt();
				}
			}
			
			int max = 0;
			for(int j=0; j<n-m+1; j++) {
				for(int k=0; k<n-m+1; k++) {
					int checking = check(m, j, k, flyArr);
					if(checking > max) max=checking;
				}
			}
			
			System.out.printf("#%d %d", i+1, max);
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
