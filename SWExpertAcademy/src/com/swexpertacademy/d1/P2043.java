package com.swexpertacademy.d1;

/*
 * 2018-10-16
 * P2043. ������ ��й�ȣ
 * @input	: p k 
 * @output	: p-k+1
*/

import java.util.Scanner;

public class P2043 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int p, k;
        p = sc.nextInt();
        k = sc.nextInt();
        
        System.out.println(p-k+1);
        
        sc.close();
		
	}

}
