package com.swexpertacademy.d1;

/*
 * 2018-10-09
 * 2025. N�ٵ���
 * 1���� �־��� ���ڸ�ŭ ��� ���� ���� ����Ͻÿ�.
 * ��, �־��� ���ڴ� 10000�� ���� �ʴ´�.
 * @input	: n
 * @output	: 1+2+...+n
*/

import java.util.Scanner;

public class P2025 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int total = 0;
		
		for(int i=1; i<=num; i++) {
			total += i;
		}
		
		System.out.println(total);
		
		sc.close();
		
	}

}
