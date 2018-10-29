package com.swexpertacademy.d2;

/*
 * 2018-10-29
 * P1976. ½Ã°¢ µ¡¼À
 * @input	: T
 * 			  HH1 MM1 HH2 MM2
 * @output	: #1 HH1+HH2 MM1+MM2 
*/

import java.util.Scanner;

public class P1976 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			int firstHour = sc.nextInt();
			int firstMin = sc.nextInt();
			int nextHour = sc.nextInt();
			int nextMin = sc.nextInt();
			
			int Hour, Min;
			
			Hour = firstHour + nextHour;
			Min = firstMin + nextMin;
			if(Min>60) {
				Min-=60;
				Hour++;
			}
			if(Hour>12) {
				Hour-=12;
			}
			
			System.out.printf("#%d %d %d", i+1, Hour, Min);
			System.out.println();
			
		}
		
		sc.close();
	}

}
