package com.swexpertacademy.d1;

/*
 * 2018-10-09
 * P2029. ��� ������ ����ϱ�
 * 2���� �� a, b�� �Է� �޾�, a�� b�� ���� ��� �������� ����ϴ� ���α׷��� �ۼ��϶�.
 * [���� ����]
 * �� ���� 1�̻� 10000������ �����̴�.
 * @input	: T
 * 			  a b
 * 			  a b
 * @output	: #1 a/b a%b
 * 			  #2 a/b a%b
*/

import java.util.Scanner;

public class P2029 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] ansArr = new int[testCase];
        
        for (int i=1; i<=testCase; i++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            
            System.out.printf("#%d %s %s", i, a/b, a%b);
            System.out.println();
        }
        
	}

}
