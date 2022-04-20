package ch11;

public class Main {
	public static void main(String[] args) {
		Seller 사과장수1 = new Seller(1000000, 100, 1000);
		
		Buyer 홍길동 = new Buyer(10000, 0);
		Buyer 신보근 = new Buyer(10000, 0);
		Buyer 이준영 = new Buyer(10000, 0);
		
		
		
		홍길동.pay(사과장수1, 2000);
		신보근.pay(사과장수1, 5000);
		이준영.pay(사과장수1, 1000);
		사과장수1.ShowInfo();
		
		
		
		System.out.println();
		홍길동.ShowInfo();
		신보근.ShowInfo();
		이준영.ShowInfo();
		
	}
}
