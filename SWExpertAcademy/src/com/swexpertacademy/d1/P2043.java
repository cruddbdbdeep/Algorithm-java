package com.swexpertacademy.d1;

/*
 * 2018-10-16
 * P2043. ������ ��й�ȣ
 * ������ ��й�ȣ�� ������ ���� �ʴ´�.
 * ��й�ȣ P�� 000���� 999���� ��ȣ ���� �ϳ��̴�.
 * �־����� ��ȣ K���� 1�� �����ϸ� ��й�ȣ�� Ȯ���� �� �����̴�.
 * ���� ��� ��й�ȣ P�� 123 �̰� �־����� ��ȣ K�� 100 �� ��, 100���� 123���� 24�� Ȯ���Ͽ� ��й�ȣ�� ���� �� �ִ�.
 * P�� K�� �־����� K���� �����Ͽ� �� �� ���� P�� ���� �� �ִ��� �˾ƺ���.
 * @input	: p k 
 * @output	: p-k+1
*/

import java.util.Scanner;

public class P2043 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int p, k;
        p = sc.nextInt();
        k = sc.nextInt();
        
        System.out.println(p-k+1);
		
	}

}
