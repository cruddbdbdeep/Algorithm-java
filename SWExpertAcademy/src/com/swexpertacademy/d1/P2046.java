package com.swexpertacademy.d1;

/*
 * 2018-10-17
 * P2046. ½ºÅÆÇÁ Âï±â
 * @input	: n
 * @output	: #*n
*/

import java.util.Scanner;

public class P2046 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			System.out.print('#');
		}
		
		sc.close();
		
	}

}
