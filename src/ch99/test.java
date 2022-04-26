package ch99;

class C01Buyer{
	private int MyMoney;
	private int AppleCnt;
	public C01Buyer(int myMoney, int appleCnt) {
		MyMoney = myMoney;
		AppleCnt = appleCnt;
	}
	public void Pay(C01Seller seller, int money) {
		MyMoney -= money;
		int cnt = seller.Receive(money);
		AppleCnt += cnt;
	}
	
	public void ShowInfo() {
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("사과 개수 : " + AppleCnt);
	}
	
	
}

class C01Seller{
	private int MyMoney;
	private int AppleCnt;
	public int Price;
	public C01Seller(int myMoney, int appleCnt, int price) {
		MyMoney = myMoney;
		AppleCnt = appleCnt;
		Price = price;
	}
	
	public int Receive(int money) {
		MyMoney += money;
		int cnt = money / Price;
		AppleCnt -= cnt;
		return cnt;
	}
	
	public void ShowInfo() {
		System.out.println("보유 금액 : " + MyMoney);
		System.out.println("사과 개수 : " + AppleCnt);
		System.out.println("개당 가격 : " + Price);
	}
	
	
}



public class test {
	public static void main(String[] args) {
		C01Seller seller = new C01Seller(100000, 100, 1000);
		C01Buyer buyer01 = new C01Buyer(10000, 0);
		C01Buyer buyer02 = new C01Buyer(20000, 0);
		C01Buyer buyer03 = new C01Buyer(30000, 0);
		
		buyer01.Pay(seller, 2000);
		buyer02.Pay(seller, 5000);
		buyer03.Pay(seller, 3000);
		System.out.println("---판매자 정보---");
		seller.ShowInfo();
		System.out.println("---구매자 정보---");
		System.out.println("-buyer01-");
		buyer01.ShowInfo();
		System.out.println("-buyer02-");
		buyer02.ShowInfo();
		System.out.println("-buyer03-");
		buyer03.ShowInfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
