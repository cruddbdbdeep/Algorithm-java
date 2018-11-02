package com.swexpertacademy.d3;

/*
 * 2018-11-02
 * P1208. [S/W 문제해결 기본] 1일차 - Flatten
 * @input	: T1
 * 			  n1 n2 ... n100
 * @output	: #1 max-min
*/

import java.util.Scanner;

public class P1208_1 {
	
	static int[] boxArr = new int[100];
	static int find_maxIndex(int[] numArr) {
		int maxIndex = 0;
		int max = 0;
		for(int i=0; i<100; i++) {
			if(numArr[i]>max) {
				max = numArr[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	static int find_minIndex(int[] numArr) {
		int minIndex = 0;
		int min = 100;
		for(int i=0; i<100; i++) {
			if(numArr[i]<min) {
				min = numArr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			
			int dump = sc.nextInt();
			
			for(int i=0; i<100; i++) {
				boxArr[i] = sc.nextInt();
			}
			
			for(int i=0; i<dump; i++) {
				boxArr[find_maxIndex(boxArr)]-=1;
				boxArr[find_minIndex(boxArr)]+=1;
			}
			int answer = boxArr[find_maxIndex(boxArr)]-boxArr[find_minIndex(boxArr)];
			System.out.printf("#%d %d\n", t, answer);
		}
		
		sc.close();
		
	}

}
