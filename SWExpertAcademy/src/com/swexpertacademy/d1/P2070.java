package com.swexpertacademy.d1;

/*
 * 2018-10-19
 * P2070. Å« ³ð, ÀÛÀº ³ð, °°Àº ³ð
 * @input	: T
 * 			  a b
 * @output	: #1 <(a<b) or =(a=b) or >(a>b)
*/

import java.util.Scanner;

public class P2070 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int a, b;
			String result;
			a = sc.nextInt();
			b = sc.nextInt();
			
			if(a>b) {
				result = ">";
			} else if(a<b) {
				result = "<";
			} else {
				result = "=";
			}
			System.out.printf("#%d %s", i+1, result);
			System.out.println();
		}
		
		sc.close();

	}

}
