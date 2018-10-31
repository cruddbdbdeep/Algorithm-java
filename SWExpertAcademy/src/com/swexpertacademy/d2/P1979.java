package com.swexpertacademy.d2;

/*
 * 2018-10-31
 * P1979. 어디에 단어가 들어갈 수 있을까
 * @input	: T
 * 			  puzzle_size puzzle_blank_count
 * 			  0 0 0 0 ... puzzle_size
 * 			  1 1 1 1 ... puzzle_size
 * 			  0 0 0 0 ... puzzle_size
 * 			  1 1 1 1 ... puzzle_size
 * 			  ...
 * 			  puzzle_size
 * @output	: #1 count
*/

import java.util.Scanner;

public class P1979 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			int n = sc.nextInt();
			int puzzleCount = sc.nextInt(); 
			int[][] puzzle = new int[n][n];
			int cnt = 0;
			int check = 0;

			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					puzzle[j][k] = sc.nextInt();
				}
			}
			
			// check row
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					if(puzzle[j][k]==1) {
						check++;
					} else {
						if(check==puzzleCount) {
							cnt++;
						}
						check=0;
					}
				}
				if(check==puzzleCount) {
					cnt++;
				}
				check=0;
			}
			
			// check column
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					if(puzzle[k][j]==1) {
						check++;
					} else {
						if(check==puzzleCount) {
							cnt++;
						}
						check=0;
					}
				}
				if(check==puzzleCount) {
					cnt++;
				}
				check=0;
			}
			
			System.out.printf("#%d %d", i+1, cnt);
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
