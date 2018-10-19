package com.swexpertacademy.d1;

/*
 * 2018-10-18
 * P2063. 중간값 찾기
 * @input	: n
 * 			  num1 num2 num3 ... num(n-1) num(n)
 * @output	: num((1+n)/2)
 * @use		: Arrays.sort(arr) - 배열 오름차순 정렬
*/

import java.util.Scanner;
import java.util.Arrays;

public class P2063 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.nextLine();
		
		int[] numArr = new int[n]; 
		for(int i=0; i<n; i++) {
			numArr[i] = sc.nextInt();
		}
		
		Arrays.sort(numArr);
		
		System.out.println(numArr[(1+n)/2-1]);
		
		sc.close();
		
	}

}
