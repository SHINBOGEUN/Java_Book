package ch18;

import java.util.Scanner;

class Book{
	String Bookcode;
	String Bookname;
	String publisher;
	String amount;
	
	
	public Book(String bookcode, String bookname, String publisher, String amount) {
		Bookcode = bookcode;
		Bookname = bookname;
		this.publisher = publisher;
		this.amount = amount;
	}
}
public class C02ClassArrayMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Book BookList[] = null;
		int num = 0;
		int count=0;
		while (true) {
			System.out.println("---------BookStore-----------");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 검색");
			System.out.println("3. 전체 도서 확인");
			System.out.println("4. 종료");
			System.out.println("---------BookStore-----------");
			System.out.println("번호 : ");
			num= input.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("몇권으 등록하나요??>>>>>");
				count = input.nextInt();
				BookList= new Book[count];
				for (int i = 0; i < count; i++) {
					System.out.println("등록할 도서를 입력 하세요>>>>(코드, 제목, 저자, 수량)");
					String Bookcode = input.next();
					String Bookname = input.next();
					String publisher = input.next();
					String Amount = input.next();
					BookList[i] = new Book(Bookcode, Bookname, publisher, Amount);
				}
				break;
			case 2:
				System.out.println("현재 도서는 = " + BookList.length + "권 입니다.");
				System.out.print("검색할 도서를 입력하세요 >>>>");
				String name = input.next();
				System.out.println(BookList[0].Bookname);
				for (int i = 0; i <BookList.length ; i++) {
					if (BookList[i].Bookname.contains(name)) {
						System.out.printf("%s %s %s %s \n",BookList[i].Bookcode,BookList[i].Bookname,BookList[i].publisher,BookList[i].amount);
						break;
					}else {
						System.out.println("존재하지 않는 책입니다.");
					}
				}
				break;
			case 3:
				for (int i = 0; i < BookList.length; i++) {
					System.out.printf("책 코드 : %s  책 제목 : %s  책 저자 : %s 책 수량: %s\n",BookList[i].Bookcode,BookList[i].Bookname,BookList[i].publisher,BookList[i].amount);
				}
				break;
			case 4:
				System.exit(-1);
				break;
			}
			
			
		}
	}

}
