package com.swexpertacademy.d2;

/*
 * 2018-10-24
 * P1940. °¡¶ù! RCÄ«!
 * @input	: T
 * 			  sec
 * 			  command (accel)
 * @output	: #1 distance
 * @use		: 
*/

import java.util.Scanner;

public class P1940 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		
		for(int i=0; i<testCase; i++) {
			
			int totalSec = sc.nextInt();
			
			int velocity = 0;
			int distance = 0;
			for(int j=0; j<totalSec; j++) {
				int command, accel;
				command = sc.nextInt();
				switch(command) {
					case 0:
						distance += velocity;
						break;
					case 1:
						accel = sc.nextInt();
						velocity += accel;
						distance += velocity;
						break;
					case 2:
						accel = sc.nextInt();
						velocity = (accel<velocity)? velocity-accel : 0;
						distance += velocity;
						break;
				}
			}
			
			System.out.printf("#%d %d", i+1, distance);
			System.out.println();
			
		}
		
		sc.close();
		
	}

}
