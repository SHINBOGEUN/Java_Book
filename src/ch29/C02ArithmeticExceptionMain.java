package ch29;

import java.util.Scanner;

public class C02ArithmeticExceptionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true ) {
			try {
				System.out.print("정수 입력 : ");
				int num = sc.nextInt();
				System.out.println("나눌수 입력 : ");
				int div = sc.nextInt();
				System.out.println("결과 : " + (num / div));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}

	
}
