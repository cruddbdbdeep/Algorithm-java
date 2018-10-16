package com.swexpertacademy.d1;

/*
 * 2018-10-09
 * P2029. 몫과 나머지 출력하기
 * 2개의 수 a, b를 입력 받아, a를 b로 나눈 몫과 나머지를 출력하는 프로그램을 작성하라.
 * [제약 사항]
 * 각 수는 1이상 10000이하의 정수이다.
 * @input	: T
 * 			  a b
 * 			  a b
 * @output	: #1 a/b a%b
 * 			  #2 a/b a%b
*/

import java.util.Scanner;

public class P2029 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] ansArr = new int[testCase];
        
        for (int i=1; i<=testCase; i++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            
            System.out.printf("#%d %s %s", i, a/b, a%b);
            System.out.println();
        }
        
	}

}
