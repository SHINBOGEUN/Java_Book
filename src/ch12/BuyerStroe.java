package ch12;

public class  BuyerStroe{
	int Mymoney;
	int colacount;
	
	
	public BuyerStroe(int mymoney, int colacount) {
		Mymoney = mymoney;
		this.colacount = colacount;
	}
	
	void Pay(int money, SellerStore sel) {
		Mymoney -= money;
		int cnt = sel.Receive(money);
		colacount += cnt;
	}
	
	void ShowInfo() {
		System.out.println("보유금액 : " + Mymoney);
		System.out.println("콜라개수 : " + colacount);
	}
	
	
	
}
