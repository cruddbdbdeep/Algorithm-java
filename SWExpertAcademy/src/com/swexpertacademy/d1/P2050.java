package com.swexpertacademy.d1;

/*
 * 2018-10-17
 * P2050. 알파벳을 숫자로 변환
 * @input	: ABCDEFGHIJKLMNOPQRSTUVWXYZ
 * @output	: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
 * @use		: .toCharArry() - 여러 문자의 String을 char의 배열로 받음
 * 			  (int)char - char를 아스키코드로 변환
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
