package ch04;
import java.util.Scanner;
public class C03Scanner {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
        System.out.print("정수 입력 : ");
        int num1 = input.nextInt();
        System.out.println("정수 값 : " + num1);

        System.out.print("실수 입력 : ");
        double num2 = input.nextDouble();
        System.out.println("실수 값 : " + num2);
        
		System.out.print("문자열 입력 : ");
	    String str1 = input.next();
	    System.out.println("문자열 (띄어쓰기x) 값 : " + str1);

	    input.nextLine(); // 

	    System.out.print("만자열 입력 : ");
	    String str2 = input.nextLine();
	    System.out.println("문자열 값(띄어쓰기 o) : " + str2);


	    input.close();
		
	}

}
