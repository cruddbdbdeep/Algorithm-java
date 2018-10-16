package com.swexpertacademy.d1;

/*
 * 2018-10-09
 * P1933. 간단한 N 의 약수
 * 입력으로 1개의 정수 N 이 주어진다.
 * 정수 N 의 약수를 오름차순으로 출력하는 프로그램을 작성하라.
 * @input	: n
 * @output	: 1 factor ... n
*/

import java.util.Scanner;

public class P1933 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
		
	}

}
