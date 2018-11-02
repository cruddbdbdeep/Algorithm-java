package com.swexpertacademy.d3;

/*
 * 2018-11-02
 * P1208. [S/W 문제해결 기본] 1일차 - Flatten
 * @input	: T1
 * 			  n1 n2 ... n100
 * @output	: #1 max-min 
 * @use		: Arrays.sort(arr) - 오름차순 정렬
*/

import java.util.Arrays;
import java.util.Scanner;

public class P1208_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			
			int dump = sc.nextInt();
			int[] boxArr = new int[100];
			
			for(int i=0; i<100; i++) {
				boxArr[i] = sc.nextInt();
			}
			
			Arrays.sort(boxArr);
			
			for(int i=0; i<dump; i++) {
				boxArr[99]-=1;
				boxArr[0]+=1;
				Arrays.sort(boxArr);
			}
			int answer = boxArr[99]-boxArr[0];
			System.out.printf("#%d %d\n", t, answer);
		}
		
		sc.close();
		
	}

}
