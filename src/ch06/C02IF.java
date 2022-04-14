package ch06;
import java.util.*;
public class C02IF {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		int age = input.nextInt();
//		if (age >= 20) {
//			System.out.println("성인입니다.");
//		}else if ( age >= 8) {
//			System.out.println("취학아동입니다..힘내렴");
//		}else {
//			System.out.println("미취학아동입니다");
//		}
		
		
		
		
		int score = input.nextInt();

        if (score >= 90) {
            System.out.println("점수 : A");
        }else if (score >= 80) {
            System.out.println("점수 : B");
        }else if (score >= 70){
            System.out.println("점수 : C");
        }else if (score >= 60) {
            System.out.println("점수 : D");
        }else {
            System.out.println("점수 : F");
        }



        int age = input.nextInt();
        if (age < 8) {
            System.out.println("8세미만 :1000원");
        }else if (age <14) {
            System.out.println("14세 미만 :2000원");
        }else if (age <20) {
            System.out.println("20세 미만 :2500원");
        }else {
            System.out.println("20세 이상 :3000원");
        }		
		
        
        
        
        

	}

}
