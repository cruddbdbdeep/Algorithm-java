package com.swexpertacademy.d1;

/*
 * 2018-10-09
 * P1938. ���� ������ ����
 * �� ���� �ڿ����� �Է¹޾� ��Ģ������ �����ϴ� ���α׷��� �ۼ��϶�.
 * [���� ����]
 * 1. �� ���� �ڿ��� a, b�� 1���� 9������ �ڿ����̴�. (1 �� a, b �� 9)
 * 2. ��Ģ���� + , - , * , / ������ ������ ����� ����Ѵ�.
 * 3. ������ ������ ������� �Ҽ��� ������ ���ڴ� ������.
 * @input	: a b
 * @output	: a+b
 * 			  a-b
 * 			  a*b
 * 			  a/b
*/

import java.util.Scanner;

public class P1938 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		sc.close();
	}

}
