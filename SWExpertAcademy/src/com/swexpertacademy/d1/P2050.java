package com.swexpertacademy.d1;

/*
 * 2018-10-17
 * P2050. ���ĺ��� ���ڷ� ��ȯ
 * @input	: ABCDEFGHIJKLMNOPQRSTUVWXYZ
 * @output	: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
 * @use		: .toCharArry() - ���� ������ String�� char�� �迭�� ����
 * 			  (int)char - char�� �ƽ�Ű�ڵ�� ��ȯ
*/

import java.util.Scanner;

public class P2050 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		str = str.toUpperCase();
		
		char[] charArr = str.toCharArray();
		
		for(int i=0; i<charArr.length; i++) {
			System.out.print((int)charArr[i]-64 + " ");
		}
		
		sc.close();

	}

}
