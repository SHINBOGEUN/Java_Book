package ch11;

public class Buyer {
	int Mymoney;
	int Applecount;
	
	public Buyer(int money, int cnt) {
		this.Mymoney = money;
		this.Applecount = cnt;
	}
	
	void pay(Seller sel, int money) {
		//1 판매자(seller)에게 돈을 전달
		Mymoney -= money;
		int cnt = sel.Receive(money);
		Applecount += cnt;
	}
	
	
	void ShowInfo() {
		System.out.println("보유금액 : " + Mymoney);
		System.out.println("사과개수 : " + Applecount);
	}
	
	
	
	
	
	
	
}
