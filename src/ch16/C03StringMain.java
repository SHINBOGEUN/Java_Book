package ch16;

import java.util.Scanner;

public class C03StringMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		System.out.println("문자열의 길이 : " + str1.length());
		System.out.println("문자 2번째 : " + str1.charAt(2));
		System.out.println("문자 3번째 : " + str1.charAt(3));
		System.out.println("문자 4번째 : " + str1.charAt(4));
		System.out.println("문자열 대문자 : " + str1.toUpperCase());
		System.out.println("문자열 소문자 : " + str1.toLowerCase());
		
	}
}
