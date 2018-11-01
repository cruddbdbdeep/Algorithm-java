package com.swexpertacademy.d2;

/*
 * 2018-11-01
 * P1926. ������ 369����
 * @input	: n
 * @output	: 1 2 - 4 ... n
 * @use		: String.valueOf(int) - int�� String���� ��ȯ
 * 			  String.charAt(index) - index�� �ش��ϴ� String ��ȯ
*/

import java.util.Scanner;

public class P1926 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] strArr = new String[n];
		
		for(int i=1; i<=n; i++) {
			strArr[i-1] = String.valueOf(i);
		}
		
		for(String str : strArr) {
			if(str.contains("3") || str.contains("6") || str.contains("9")) {
				for(int i=0; i<str.length(); i++) {
					char num = str.charAt(i);
					if(num=='3' || num=='6' || num=='9') {
						System.out.print("-");
					}
				}
				System.out.print(" ");
			} else {
				System.out.print(str + " ");
			}
			
		}
		
		sc.close();
		
	}

}
