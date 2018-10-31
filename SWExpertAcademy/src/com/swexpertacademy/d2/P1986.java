package com.swexpertacademy.d2;

/*
 * 2018-10-30
 * P1986. 지그재그 숫자
 * @input	: T
 * 			  n1 (n1%2==0)
 * 			  n2 (n2%2==1)
 * @output	: #1 1-2+3-4+...-n
 * 			  #2 1-2+3-4+...+n
*/

import java.util.Scanner;

public class P1986 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			int n = sc.nextInt();
			int total = 0;
			for(int j=1; j<=n; j++) {
				if(j%2==0) {
					total -= j;
				} else {
					total += j;
				}
			}
			
			System.out.printf("#%d %d", i+1, total);
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
