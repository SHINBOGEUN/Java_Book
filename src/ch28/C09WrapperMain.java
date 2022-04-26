package ch28;

public class C09WrapperMain {
	public static void main(String[] args) {
		
		//자동 박싱
		Integer obj = 100;
		System.out.println("val : " + obj);
		
		//자동 UnBoxing
		int val = obj;
		System.out.println("var : " + val);
		
		//자동 UnBoxing(산술연산시)
		int result = obj + val;
		System.out.println("result : " + result);
		
	}
}
