package com.swexpertacademy.d2;

/*
 * 2018-10-24
 * P1946. 간단한 압축 풀기
 * @input	: T
 * 			  alpha_pair_num
 * 			  A n1
 * 			  B n2
 * @output	: #1
 * 			  A*n1+B*n2 (10개 넘으면 줄바꿈)
 * @use		: ArrayList.add(e), ArrayList.get(index)
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1946 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			List<String> alphaList = new ArrayList<String>();
			int line = sc.nextInt();
			for(int j=0; j<line; j++) {
				String alpha = sc.next();
				int cnt = sc.nextInt();
				for(int k=0; k<cnt; k++) {
					alphaList.add(alpha);
				}
			}
			
			System.out.printf("#%d", i+1);
			System.out.println();
			
			for(int j=0; j<alphaList.size(); j++) {
				if(j%10==0 && j!=0) {
					System.out.println();
				}
				System.out.print(alphaList.get(j));
			}
			
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
