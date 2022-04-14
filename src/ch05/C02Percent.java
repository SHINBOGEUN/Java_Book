package ch05;
import java.util.Scanner;

public class C02Percent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 1 짝/ 홀수     짝수는 나머지 0 홀수는 나머지 1
//		System.out.println(10 % 2  == 0);
//      System.out.println(11 % 2 != 0);
//      System.out.println(12 % 2);
//      System.out.println(13 % 2);
//      System.out.println(14 % 2);
		
		
		
		
		// 2 배수
		
//		System.out.println(10 % 3);
//     	System.out.println(11 % 3);
//     	System.out.println(12 % 3);
//     	System.out.println(13 % 3);
//      	System.out.println(14 % 3);
//      	System.out.println(15 % 3);
//      	System.out.println(16 % 3);
//      	System.out.println(17 % 3);
//      	System.out.println(18 % 3);
        
        
        // 미니 문제
    	//키보드로 부터 값을 2개를 입력받아 두수합이 짝수이면 짝수입니다. 홀수이면 홀수 입니다.
//      	System.out.print("정수값을 입력하세요 >>");
//        int A = input.nextInt();
//        int B = input.nextInt();
//
//        String result = ((A + B) % 2 == 0) ? "짝수입니다.": "홀수입니다.";
//
//        System.out.println(result);
//
//        String result1 = ((A + B) % 2 == 0) && ((A + B) % 3 == 0) ? "2와 3의 배수입니다." : "2,3배수가 아닙니다.";
//
//        System.out.println(result1);
//
//
//        input.close();
      	
      
      	
      	
      	
      	
      	
		// 3 범위 제한
        
        //N % 2 = > 0-1
        //N % 3 = > 0-2
        //N % 4 = > 0-3
        //N % 10 = > 0-9
//        int tmp = 0;
//        while (input.hasNextInt()) {
//        	
//        	System.out.print("값 입력 : ");
//        	tmp = input.nextInt();
//        	System.out.println("값 확인 : " + (tmp % 10));
//        	
//        	
//        }
      	
      	
      	
      	
		// 4 자리수 추출
		
      	System.out.println(12345 % 10);
      	System.out.println(12345 % 100);
      	System.out.println(12345 % 1000);
      	System.out.println(12345 % 10000);
      	System.out.println(12345 % 100000);
      	System.out.println();
      	
      	System.out.println(12345 / 10);
      	System.out.println(12345 / 100);
      	System.out.println(12345 / 1000);
      	System.out.println(12345 / 10000);
      	System.out.println(12345 / 100000);
      	
		
		
		
		
		
	}

}
