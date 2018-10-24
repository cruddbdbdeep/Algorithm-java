package com.swexpertacademy.d2;

/*
 * 2018-10-23
 * P1288. 새로운 불면증 치료법
 * @input	: T
 * 			  n1
 * 			  n2
 * @output	: #1 n1*j
 * 			  #2 n2*j
 * @use		: set
*/

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class P1288 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			int num = sc.nextInt();
			
			Set<Integer> numSet = new HashSet<>();
			
			int j=0;
			int cnt=0;
			int ans=0;
			while(numSet.size()<10) {
				j++;
				cnt++;
				int temp = num*j;
				do {
					int digit = temp%10;
					numSet.add(digit);
					temp/=10;
				} while (temp>0);
				ans = num*j;
			}
			
			System.out.printf("#%d %d", i+1, ans);
			System.out.println();
			
		}
		
		sc.close();

	}

}
