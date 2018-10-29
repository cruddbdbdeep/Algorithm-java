package com.swexpertacademy.d2;

/*
 * 2018-10-29
 * P1974. ½ºµµÄí °ËÁõ
 * @input	: T
 * 			  n1 n2 n3 n4 n5 n6 n7 n8 n9
 * 			  n1 n2 n3 n4 n5 n6 n7 n8 n9
 * 			  n1 n2 n3 n4 n5 n6 n7 n8 n9
 * 			  n1 n2 n3 n4 n5 n6 n7 n8 n9
 * 			  n1 n2 n3 n4 n5 n6 n7 n8 n9
 * 			  n1 n2 n3 n4 n5 n6 n7 n8 n9
 * 			  n1 n2 n3 n4 n5 n6 n7 n8 n9
 * 			  n1 n2 n3 n4 n5 n6 n7 n8 n9
 * 			  n1 n2 n3 n4 n5 n6 n7 n8 n9
 * @output	: #1 0 or 1
 * @use		: set
*/

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class P1974 {
	
	static Set<Integer> numSet = new HashSet<>();
	static int check(int[][] sdoku) {
		for(int i=0; i<9; i++) {
			numSet.clear();
			for(int j=0; j<9; j++) {
				numSet.add(sdoku[i][j]);
			}
			if(numSet.size()!=9) {
				return 0;
			}
		}
		
		for(int i=0; i<9; i++) {
			numSet.clear();
			for(int j=0; j<9; j++) {
				numSet.add(sdoku[j][i]);
			}
			if(numSet.size()!=9) {
				return 0;
			}
		}
		
		for(int i=0; i<9; i+=3) {
			for(int j=0; j<9; j+=3) {
				numSet.clear();
				for(int k=i; k<i+3; k++) {
					for(int l=j; l<j+3; l++) {
						numSet.add(sdoku[k][l]);
					}
				}
				if(numSet.size()!=9) {
					return 0;
				}
			}
		}
		
		return 1;
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			int[][] sdoku = new int[9][9];
			for(int j=0; j<9; j++) {
				for(int k=0; k<9; k++) {
					sdoku[j][k] = sc.nextInt();
				}
			}
			
			int result = check(sdoku);
			
			System.out.printf("#%d %d", i+1, result);
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
