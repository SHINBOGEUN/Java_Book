package ch29;

import java.util.Iterator;

public class C03IndexOutOfBoundExceptionMain {

	public static void main(String[] args) {
		int arr [] = {10, 20, 30};
		
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			System.out.println("예외발생 무관하게 처리");
			System.out.println("미진분식");
		}
		
		
		System.out.println("실행코드1");
		System.out.println("실행코드2");
		
		
	}

}
