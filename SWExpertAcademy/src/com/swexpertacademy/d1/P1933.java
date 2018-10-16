package com.swexpertacademy.d1;

/*
 * 2018-10-09
 * P1933. ������ N �� ���
 * �Է����� 1���� ���� N �� �־�����.
 * ���� N �� ����� ������������ ����ϴ� ���α׷��� �ۼ��϶�.
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
