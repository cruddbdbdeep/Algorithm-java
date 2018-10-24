package com.swexpertacademy.d2;

/*
 * 2018-10-24
 * P1945. 간단한 소인수분해
 * @input	: T
 * 			  num1
 * 			  num2
 * @output	: #1 NI(2) NI(3) NI(5) NI(7) NI(11)
 * 			  #2 NI(2) NI(3) NI(5) NI(7) NI(11)
*/

import java.util.Scanner;

public class P1945 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();

		int[] factorArr = {2, 3, 5, 7, 11};
		for(int i=0; i<testCase; i++) {
			
			int num = sc.nextInt();
			
			int[] numIndexArr = new int[5];
			for(int j=0; j<5; j++) {
				int cnt = 0;
				int factor = factorArr[j];
				while(num%factor==0) {
					cnt++;
					num/=factor;
				}
				numIndexArr[j] = cnt;
			}
			System.out.printf("#%d ", i+1);
			for(int j=0; j<5; j++) {
				System.out.print(numIndexArr[j] + " ");	
			}
			System.out.println();
		}
		sc.close();
	}
}
