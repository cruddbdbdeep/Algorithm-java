package com.swexpertacademy.d1;

/*
 * 2018-10-17
 * P2047. �Ź� ������
 * @input	: the_nature_of_the_article
 * @output	: THE_NATURE_OF_THE_ARTICLE
 * @use		: .toUpperCase() - �ҹ��ڸ� �빮�ڷ� ��ȯ
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
