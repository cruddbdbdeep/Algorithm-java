package com.swexpertacademy.d1;

/*
 * 2018-10-09
 * P1933. 간단한 N 의 약수
 * @input	: n
 * @output	: 1 factor ... n
*/

import java.util.Scanner;

public class P1933 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
		
	}

}
