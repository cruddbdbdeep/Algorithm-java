package com.swexpertacademy.d1;

/*
 * 2018-10-09
 * P1936. 1대1 가위바위보 
 * A와 B가 가위바위보를 하였다. 
 * 가위는 1, 바위는 2, 보는 3으로 표현되며 A와 B가 무엇을 냈는지 입력으로 주어진다.
 * A와 B중에 누가 이겼는지 판별해보자. 단, 비기는 경우는 없다.
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
