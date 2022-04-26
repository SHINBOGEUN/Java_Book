package ch19;

import java.util.Iterator;



//이클립스
//파일 우 클릭 -> Rus as -> Run Configuration - > Arguments 탭 ->
//Program argument 에서 "Hello" "world" 입력

//CMD
//파일 우클릭 >> 속성 >> 경로 복사 >> CMD활성화 >>
//cd 경로 붙어넣기
//javac C07MainArgTest.java
//cd ..
//java ch19.C07MainArgTest 안녕 나는 홍길동 이라고 해


public class C07MainArgTest {
	public static void main(String[] args) {

		System.out.println("CNT : " + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
