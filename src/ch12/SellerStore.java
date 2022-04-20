package ch12;

public class SellerStore {
	int Mymoney;
	int colacount;
	int price;
	
	public SellerStore(int mymoney, int colacount, int price) {
		Mymoney = mymoney;
		this.colacount = colacount;
		this.price = price;
	}
	
	int Receive(int money) {
		Mymoney += money;
		int cnt = money/price;
		colacount -= cnt;
		return cnt;
	}


	void ShowInfo() {
		System.out.println("보유금액 : " + Mymoney);
		System.out.println("콜라개수 : " + colacount);
	}
	
}
