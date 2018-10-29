package com.swexpertacademy.d2;

/*
 * 2018-10-25
 * P1966. 숫자를 정렬하자
 * @input	: T
 * 			  n
 * 			  1 4 7 ... 0
 * @output	: 0 1 4 7 ...
 * @use		: Arrays.sort() - 오름차순 정렬
*/

import java.util.Arrays;
import java.util.Scanner;

public class P1966 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			int n = sc.nextInt();
			int[] numArr = new int[n];
			for(int j=0; j<n; j++) {
				numArr[j] = sc.nextInt();
			}
			
			Arrays.sort(numArr);
			
			System.out.printf("#%d ", i+1);
			for(int num : numArr) {
				System.out.print(num + " ");
			}
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
