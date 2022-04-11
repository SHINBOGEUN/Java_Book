package ch03;

public class C04ArithChange {
	public static void main(String[] args) {
		
		//산술 연산시 자동형변환
		
		//정수연산식 (int보다 작은 변수자료형(short,char,byte))
		// - >
//		byte x = 10;
//		byte y = 20;
//		byte z =30;
//		
//		byte result = x + y + z; // 컴파일 에러 ...왜?? 산술연산시 int보다 작으면 int로 자동형변환
//		int result = x + y + z;
		
//		System.out.println(result);
		//정수연산시 (int보다 큰 변수자료형(long))
		// -> 큰자료형으로 형변환
		
//		byte x = 10;
//		int y = 20;
//		long z = 30L;
//		
//		long result = x + y + z;
//		
//		System.out.println(result);
//		
//		
		//실수 연산식
		
		int x = 10;
		float y =3.3f;
		double z = 5.5;
		
		double result = x + y + z;
		
		System.out.println(result); // 실수 자료형(size큰자료형)으로 자동형변환	
		
	}

}
