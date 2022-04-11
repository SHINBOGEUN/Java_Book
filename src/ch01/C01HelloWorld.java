package ch01;   // 패키지 명 (폴더와 유사) 


import java.util.*;
public class C01HelloWorld  // 클래스영역 - 개게 지향 구현 단위
{
    //메서드
    //main 매서드           : 최초로 (제일처음 실행되는 매서드)
    //library 매서드(함수)   : 미리만들어져 제공되는 매서드
    //사용자정의 매서드(함수)  : 프로그래머에 의해 제작되는 매서드


	public static void main(String[] args) // Main 매서드 영역 - 절차지향 구현 단위
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Hello world!!!!"); // 콘솔 화면 출력 메서드 (기본제공 출력메서드)
		// ; - 세미콜론 : 실해문의 마지막, 마침표를 의미
		
		// System.out.printf() : 서식문자를 출력
		// 서식 : 서류를 꾸미는 일정한 양식        ex) 이력서
		 System.out.printf("%d + %d = %d\n", 10, 20, 10+20);
		 
	        

	        System.out.println("저의 이름은 홍길동입니다.\n나이는 22세입니다.\n사는곳은 대구입니다.");
	        System.out.println("1" + 1);


	        System.out.printf("%d + %d = %d\n", 10, 20, 10+20);

	        System.out.printf("%d + %d + %d\n", 10, 20, 10 + 20);
	        System.out.printf("%f + %f + %f\n", 10.1, 20.2, 10.1 + 20.2);
	        System.out.printf("%c + %c + %c\n", 'a','b','c');
	        System.out.printf("%s + %s + %s\n", "this is", "String", "test");
	        System.out.printf("%d . [%c] + %s\n" , 1, 'A', "programming Basic");



	        System.out.printf("%s  %d  %s\n", "홍길동", 20, "대구");
	        System.out.printf("%s  %d  %s\n", "김철수", 30, "울산");
	        System.out.printf("%s  %d  %s\n", "박영희", 40, "인천");


	        System.out.printf("나의 이름은 %s 입니다\n", "신보근");
	        System.out.printf("나의 나이는 %d 입니다" , 26);


	        System.out.println("I say \"Hello\"");
	        

	        
		
	}

}