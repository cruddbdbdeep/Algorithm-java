package com.swexpertacademy.d2;

/*
 * 2018-11-01
 * P1989. 초심자의 회문 검사
 * @input	: T
 * 			  word1
 * 			  word2
 * @output	: #1 1(palindrome) or 0(not)
 * @use		: String.charAt(index) - index에 해당하는 문자 반환
*/

import java.util.Scanner;

public class P1989 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<testCase; i++) {
			
			String word = sc.nextLine();
			int result = 0;

			for(int j=0; j<(word.length())/2; j++) {
				if(word.charAt(j)==word.charAt(word.length()-1-j)) {
					result = 1;
				}
			}
			
			System.out.printf("#%d %d", i+1, result);
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
