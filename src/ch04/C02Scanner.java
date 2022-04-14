package ch04;

import java.util.*;



public class C02Scanner {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요 >>");
		int num1 = input.nextInt();
		System.out.println();
		
		System.out.print("수학점수를 입력하세요 >>");
		int num2 = input.nextInt();
		System.out.println();
		
		System.out.print("영어점수를 입력하세요 >>");
		int num3 = input.nextInt();
		System.out.println();
		
		
		int sum = num1 + num2 + num3;
		
		System.out.println("총합 = " + sum);
		System.out.println("평균 = " + ((double)sum / 3));
		
		
		input.close();
		
	}
}
