package com.swexpertacademy.d2;

/*
 * 2018-10-31
 * P1983. 조교의 성적 매기기
 * @input	: T
 * 			  student_num rank
 * 			  mid final assignment 
 * @output	: #1 grade
 * @use		: Arrays.asList(array) - 배열을 리스트로 전환
 * 			  list.indexOf(value) - 리스트 value의 index 반환 
*/

import java.util.Arrays;
import java.util.Scanner;

public class P1983 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		String[] gradesArr = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
		
		for(int i=0; i<testCase; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			Integer[] scoresArr = new Integer[n];
			
			for(int j=0; j<n; j++) {
				
				int midScore = sc.nextInt();
				int finalScore = sc.nextInt();
				int assignment = sc.nextInt();
				
				scoresArr[j] = midScore*35 + finalScore*45 + assignment*20;
				
			}
			
			int score = scoresArr[k-1];

			Arrays.sort(scoresArr);
			int rank = Arrays.asList(scoresArr).indexOf(score);

			System.out.printf("#%d %s", i+1, gradesArr[10*rank/n]);
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
