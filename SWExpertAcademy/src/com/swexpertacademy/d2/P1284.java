package com.swexpertacademy.d2;

/*
 * 2018-10-23
 * P1284. 수도 요금 경쟁
 * @input	: T
 * 			  P Q R S W
 * @output	: #1 P*W or (Q or Q+(W-R)*S)
 * @use		: (boolean)? a(True) : b(False) - 삼항연산자
*/

import java.util.Scanner;

public class P1284 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
		
			int P, Q, R, S, W;
			P = sc.nextInt();
			Q = sc.nextInt();
			R = sc.nextInt();
			S = sc.nextInt();
			W = sc.nextInt();
			
			int waterRate_A = P*W;
			int waterRate_B = (W<=R)? Q : Q + (W-R)*S;
			int waterRate = (waterRate_A<waterRate_B)? waterRate_A : waterRate_B; 
			
			System.out.printf("#%d %d", i+1, waterRate);
			System.out.println();

		}
				
		sc.close();
		
	}

}
