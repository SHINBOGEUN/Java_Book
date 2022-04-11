package ch02;

public class C04자료형 {
	public static void main(String[] args) {
		
		//Definition  : 정의 (이름부여 + 공간형성)
		//Declaration : 선언 (이름부여)
		//Initialize  : 초기화 (이름부여+ 공간형성 + 기본값 저장)
		
		int num1;  	// 4byte 정수저장 공간을 지정한뒤 num1이름 부여(변수를 정의)
		num1 = 10;	// 10상수값을 상수플에 저장한뒤 num1공간에 대입
		int num2 =4;// 4상수값을 사수풀에 저장한뒤 4byte정수 num2공산에 초기화
		int num3 = num1 + num2;	//num1값과 num2값의 합을 num3변수공가에 초기화
		System.out.println(num3); //num3안의 값을 출력
		
		
	}

}
