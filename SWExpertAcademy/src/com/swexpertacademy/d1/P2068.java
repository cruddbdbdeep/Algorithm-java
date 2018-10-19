package com.swexpertacademy.d1;

/*
 * 2018-10-19
 * P2068. 최대수 구하기
 * @input	: T
 * 			  num1 num2 ... num9 num10
 * 			  num1 num2 ... num9 num10
 * @output	: #1 num2
 * 			  #2 num9
 * 
*/

import java.util.Arrays;
import java.util.Scanner;

public class P2068 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			int[] tempArr = new int[10];
			for(int j=0; j<10; j++) {
				tempArr[j] = sc.nextInt();
			}
			
			Arrays.sort(tempArr);
			System.out.printf("#%d %d", i+1, tempArr[9]);
			System.out.println();
		}
		
		sc.close();

	}

}
