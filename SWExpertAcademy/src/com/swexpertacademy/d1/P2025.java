package com.swexpertacademy.d1;

/*
 * 2018-10-09
 * 2025. N줄덧셈
 * 1부터 주어진 숫자만큼 모두 더한 값을 출력하시오.
 * 단, 주어질 숫자는 10000을 넘지 않는다.
 * @input	: n
 * @output	: 1+2+...+n
*/

import java.util.Scanner;

public class P2025 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int total = 0;
		
		for(int i=1; i<=num; i++) {
			total += i;
		}
		
		System.out.println(total);
		
		sc.close();
		
	}

}
