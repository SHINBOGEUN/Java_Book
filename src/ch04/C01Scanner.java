package ch04;

import java.util.*;

public class C01Scanner {
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);

        //스트림 : 시냇물 물줄기(단방향성)
        //데이터가 이동되는 가상채널(주변장치-프로그램,저장공간-프로그램)

        //System.in     : 표준입력 스트림 요청 ex) 키보드
        //System.out    : 표준출력 스트림 요청 ex) 모니터
        //new Scanner(System.in)   : 표준 입력 스트림과 연결된 개게 생성
        //Scanner input : 스캐너 장치의 위치정보를 저장할 용도의 참조변수

        System.out.print("숫자를 입력하세요");
        int num = input.nextInt();
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2 + num;


        System.out.println(sum);
        System.out.println(num * num1);


        input.close();
	}

}
