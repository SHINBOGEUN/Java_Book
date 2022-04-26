package ch29;

public class C05ThrowsMain {
	
	public static void Exceptiontest(int div) throws ArithmeticException{
		int num = 10;
		System.out.println("나누기 결과 : " + (num / div));
		System.out.println("함수내부 실행코드1");
		System.out.println("함수내부 실행코드2");
	}
	
	public static void main(String[] args) {
		try {
			Exceptiontest(5);
			Exceptiontest(3);
			Exceptiontest(0); //예외 발생 오류
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("실행코드1");
		System.out.println("실행코드2");
		
		
		
		
	}
}
