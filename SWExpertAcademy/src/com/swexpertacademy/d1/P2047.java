package com.swexpertacademy.d1;

/*
 * 2018-10-17
 * P2047. 신문 헤드라인
 * @input	: the_nature_of_the_article
 * @output	: THE_NATURE_OF_THE_ARTICLE
 * @use		: .toUpperCase() - 소문자를 대문자로 변환
*/

import java.util.Scanner;

public class P2047 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String character = sc.nextLine();
		
		System.out.println(character.toUpperCase());
		
		sc.close();
		
	}

}
