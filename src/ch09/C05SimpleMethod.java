package ch09;

import java.util.*;
class C05Simple{
	
	
	
	Scanner input = new Scanner(System.in);
	
	//기능
	//반환 o매개 o
	int sum (int x, int y) {
		return x + y;
	}
	
	
	//인자를 받지않고 더한다.
	//스케너로 받아서
	int sum2() {
		System.out.println("정수 2개 입력 : ");
		int x = input.nextInt();
		int y = input.nextInt();
		return x + y;
	}
	
	
	//반환 값이 x 매개변수 o
	
	void sum3(int x, int y) {
		System.out.printf("sum3(%d, %d) = %d\n",x, y,x + y);
	}
	//반환 x 매개변수 x
	
	void sum4() {
		System.out.print("x값 입력 : ");
		int x = input.nextInt();
		System.out.print("y값 입력 : ");
		int y = input.nextInt();
		System.out.printf("%d + %d = %d",x, y,x + y);
	}
	
	
	
}

class SubClass{
	
	Scanner input = new Scanner(System.in);
	
	
	int sub1(int x, int y) {
		if (x > y) {
			return x -y;
		}else {
			return y-x;
		}
	}
	
	void sub2() {
		System.out.println("두 수를 입력하세요 : ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		if (x > y) {
			System.out.printf("%d + %d = %d", x, y, x - y);
		}else {
			System.out.printf("%d + %d = %d", x, y, y- x);
		}
		
	}
	
	
	void sub3(int x, int y) {
		if (x > y) {
			System.out.printf("%d + %d = %d", x, y, x - y);
		}else {
			System.out.printf("%d + %d = %d", x, y, y - x);
		}
		
	}
	
	
	int sub4() {
		System.out.println("정수 2개 입력 : ");
		int x = input.nextInt();
		int y = input.nextInt();
		if (x > y) {
			return x -y;
		}else {
			return y-x;
		}
	}
}




public class C05SimpleMethod {
	public static void main(String[] args) {
		C05Simple SM = new C05Simple();
		
		int result = SM.sum(10, 20);
		
		System.out.println("result : "+ result);
		
		int result1 = SM.sum2();
		
		System.out.println("result1 : " + result1);
	
		SM.sum3(111, 222);
		
		SM.sum4();
		
		
		SubClass sc = new SubClass();
		
		
		int num1 = sc.sub1(10, 20);
		System.out.println(num1);
		
		sc.sub2();
		
		sc.sub3(100, 2000);
		
		int num2 = sc.sub4();
		System.out.println(num2);
		
	}
}
