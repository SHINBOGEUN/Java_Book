package ch04;
import java.util.*;

public class C04Scanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name;
        int age;

        System.out.print("이름을 입력하세요");
        name = input.next();
        System.out.printf("%s 님의 나이를 입력하세요 ", name);
        age = input.nextInt();
        System.out.printf("%s 님의 나이는 %d 입니다.", name, age);
        System.out.println();




        String name1;
        int number;
        String phone;

        System.out.print("이름을 입력하세요 >> ");
        name1 = input.next();
        System.out.print("주민번호를 입력하세요 >>");
        number = input.nextInt();

        input.nextLine();
        System.out.print("핸드폰 번호를 입력하세요 >>");
        phone = input.nextLine();


        System.out.printf("1.이름 : %s\n2.주민 번호 : %d\n3.PH: %s", name1, number, phone);
        input.close();

		
	}
}
