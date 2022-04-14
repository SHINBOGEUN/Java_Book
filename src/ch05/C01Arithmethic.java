package ch05;

import java.util.Scanner;

public class C01Arithmethic {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        //기본 산술 연사자
//        int a = 10,b=3;
//        System.out.println("a + b = " + (a + b));
//        System.out.println("a - b = " + (a - b));
//        System.out.println("a * b = " + (a * b));
//        System.out.println("a / b = " + (a / b));
//        System.out.println("a % b = " + (a % b));  // 짝홀수 배수 범위제한 자리수

        //대입연산자 공간 = 값(먼저처리)

        //복합대입연산자
//        int a=10,b=4;
//        System.out.println("a + b ? " + (a += b));
//        System.out.println("a - b ? " + (a -= b));
//        System.out.println("a * b ? " + (a *= b));
//        System.out.println("a / b ? " + (a /= b));

        //논리연산자
//        int a = 10; int b= 20; int c = 15;
//
//        //AND 연산자(&&)  : 둘다 t t 일때 가능 t 반환
//        System.out.println((a >= b) && (b >= c)); //f && t
//        System.out.println((a <= b) && (b <= c)); //t && t
//        System.out.println((a <= b) && (b >= c)); //t && t
//        System.out.println((a >= b) && (b <= c)); //f && f
//        System.out.println();
//        //OR 연산자(||) : 둘중하나만 t 이여도 t 반환
//        System.out.println((a >= b) || (b >= c)); //f && t
//        System.out.println((a <= b) || (b <= c)); //t && t
//        System.out.println((a <= b) || (b >= c)); //t && t
//        System.out.println((a >= b) || (b <= c)); //f && f
//
        //논리부정연산자
//        boolean flag = true;
//        System.out.println("!flag = " + !flag);

        //비교연산자  (대소 관계비교, true/false를 반환
        //true (참)        :프로그래머가 원하는 결과값이 나오는 경우
        //false (거짓)     : x
//        int a =10, b= 20;
//        System.out.println("a == b ?" + (a == b));
//        System.out.println("a > b ?" + (a > b));
//        System.out.println("a >= b ?" + (a >= b));
//        System.out.println("a < b ?" + (a < b));
//        System.out.println("a <= b ?" + (a <= b));
//        System.out.println("a != b ?" + (a != b));


        //증감연산자
        //(++ : 1증가, -- : 1감소)

        //전치 연산자 : ++a, --a변수안의 값을 1 증가(or 1감소)를 먼저 연산한 다음 다른 연산처리
        //후치 연산자 : a++, --a다른 연산처리를 다 완려한다음 1증가(or 1감소)

//        int a =10, b=20 , c=0 , d= 0;
//        c = ++a + b--;
//        d = b++ + ++a;
//        System.out.println(a + " " + b + " " + c + " " + d);







        //삼항연산자
//        int score = 85;
//        char grade = (score > 90) ? 'A' : 'B';
//
//        System.out.println(grade);

//        System.out.print("국어 점수 : ");
//        int score1 = input.nextInt();
//        System.out.print("영어 점수 : ");
//        int score2 = input.nextInt();
//        System.out.print("수학 점수 :");
//        int score3 = input.nextInt();
//        int sum = (score1 + score3 + score2) / 3;
//        System.out.println(score1 >= 40 && score2 >= 40 && score3 >= 40 && sum >=70 ? "합격" : "불합격");

		
		
		
	     //비트연산자
//
//        int num1 = 15;
//        int num2 = 20;
//        int num3 = num1&num2;
//        int num4 = num1|num2;
//        int num5 = num1^num2;
//        int num6 = ~num1;
		 //시프트 연산자

//        int num7 = num1<<2;
//        int num8 = num1>>3;
//
//        System.out.println("AND 비트연산 :" + num3);
//        System.out.println("OR 비트연산 :" + num4);
//        System.out.println("XOR 비트연산 :" + num5);   //이미지 명암 반전시킬때 알고리즘을 만들때 사용
//        System.out.println("NOT 비트연산 :" + num6);
//        System.out.println(num7); //00000000 00000000 00000000 00111100
//        System.out.println(num8); //00000000 00000000 00000000 00000001
//
//        
       
		
	}
}
