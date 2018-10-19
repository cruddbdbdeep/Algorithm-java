package com.swexpertacademy.d1;

/*
 * 2018-10-17
 * P2056. 연월일 달력
 * @input	: T
 * 			  YYYYMMDD
 * @output	: #1 YYYY/MM/DD (예외:-1)
 * @use		: .substring(beginIndex, endIndex) : 문자열 추출
 * 			  Integer.valueOf(String) : 문자열을 정수로 변환
*/

import java.util.Scanner;

public class P2056 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
        int testCase = sc.nextInt();

        int[] dayArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        sc.nextLine();
        
        for (int i=1; i<=testCase; i++) {
            String date = sc.nextLine();
            
            int month = Integer.valueOf(date.substring(4,6));
            int day = Integer.valueOf(date.substring(6,8));
            
            if((month>=1 && month<=12) && (day>=1 && day<=dayArr[month-1]) ) {
            	System.out.printf("#%d %s/%s/%s", i, date.substring(0,4), date.substring(4,6), date.substring(6,8));
            	System.out.println();
            } else {
                System.out.printf("#%d -1", i);
                System.out.println();
            }
            
        }
		
		sc.close();
		
	}

}
