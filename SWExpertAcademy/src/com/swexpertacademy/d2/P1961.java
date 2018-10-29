package com.swexpertacademy.d2;

/*
 * 2018-10-25
 * P1961. 숫자 배열 회전 
 * @input	: T
 * 			  n
 * 			  a1 a2 ... an
 * 			  b1 b2 ... bn
 * 			  ...
 * 			  n1 n2 ... nn
 * @output	: n1 ... b1 a1		nn ... n2 n1	an bn ... nn
 * 			  n2 ... b2 a2		...				...
 * 			  ...				bn ... b2 b1	a2 b2 ... n2
 * 			  nn ... bn an		an ... a2 a1	a1 b1 ... n1
 * @use		: Math.abs(int) - 절대값
*/

import java.util.Scanner;

public class P1961 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			int n = sc.nextInt();
			
			int[][] Arr = new int[n][n];
			
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					Arr[j][k] = sc.nextInt();
				}
			}
			
			int[][] Arr1 = rotate(n, Arr);
			int[][] Arr2 = rotate(n, Arr1);
			int[][] Arr3 = rotate(n, Arr2);
			
			System.out.printf("#%d", i+1);
			System.out.println();
			
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					System.out.print(Arr1[j][k]);
				}
				System.out.print(" ");
				for(int k=0; k<n; k++) {
					System.out.print(Arr2[j][k]);
				}
				System.out.print(" ");
				for(int k=0; k<n; k++) {
					System.out.print(Arr3[j][k]);
				}
				System.out.println();
			}
			
		}
		
		sc.close();
		
	}
	
	public static int[][] rotate(int n, int[][] Arr) {
		int[][] newArr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				newArr[j][Math.abs(i-n+1)] = Arr[i][j];
			}
		}
		return newArr;
	}

}
