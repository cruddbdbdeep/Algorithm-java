package com.swexpertacademy.d1;

/*
 * 2018-10-09
 * P1545. �Ųٷ� ����� ���ƿ�
 * @input	: n
 * @output	: n n-1 ... 0
*/

import java.util.Scanner;

public class P1545 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=num; i>=0; i--) {
			System.out.print(i + " ");
		}
		
		sc.close();
		
	}

}
