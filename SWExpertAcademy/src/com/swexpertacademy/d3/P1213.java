package com.swexpertacademy.d3;

/*
 * 2018-11-05
 * P1213. [S/W 문제해결 기본] 3일차 - String
 * @input	: 1
 * 			  String_to_find
 * 			  Sentence_to_search
 * @output	: #1 cnt
 * @use		: String.indexOf(str) - String에서 str 검색해서 index를 반환
*/

import java.util.Scanner;

public class P1213 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int t=1; t<=10; t++) {
			
			int testCase = sc.nextInt();
			sc.nextLine();
			
			String findStr = sc.nextLine();
			String searchStr = sc.nextLine();
			int cnt = 0;
			
			while(searchStr.indexOf(findStr)!=-1) {
				cnt++;
				searchStr = searchStr.substring(searchStr.indexOf(findStr)+1);
			}
			
			System.out.printf("#%d %d\n", testCase, cnt);
		}
		
		sc.close();
		
	}

}
