package com.swexpertacademy.d1;

/*
 * 2018-10-09
 * P1936. 1대1 가위바위보 
 * @input	: a b
 * @output	: A(a>b) or B(a<b)
*/

import java.util.Scanner;

public class P1936 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        
        if(a>b) {
        	System.out.println("A");
        } else {
        	System.out.println("B");
        }
		
		sc.close();
		
	}

}
