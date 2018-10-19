package com.swexpertacademy.d1;

/*
 * 2018-10-19
 * P2071. ��հ� ���ϱ�
 * @input	: T
 * 			  num1 num2 ... num9 num10
 * @output	: #1 (num1+num2+...+num10)/10
 * @use		: Math.round(n) - �Ǽ��� ������ �ݿø�
*/

import java.util.Scanner;

public class P2071 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			double total = 0;
			for(int j=0; j<10; j++) {
				total += sc.nextInt();
			}
			System.out.printf("#%d %d", i+1, Math.round(total/10));
			System.out.println();
		}
		
		sc.close();
		
	}

}
