package ch11;

public class Seller {
	
	int Mymoney;
	int Applecount;
	int ApplePrice;
	
	
	//생성자
	public Seller(int mymoney, int applecount, int price) {
		super(); // 상속 파트에서 설명
		Mymoney = mymoney;
		Applecount = applecount;
		this.ApplePrice = price;
		
	}
	//내보유금액에 저장 사과개수계산 사과개수차감 > 사과개수 리턴;
	int Receive(int money){
		 //내 보유금액에 저장
		Mymoney += money;
		int cnt = money/ApplePrice;
		Applecount -= cnt;
		return cnt;
	}
	
	void ShowInfo() {
		System.out.println("보유금액 : " + Mymoney);
		System.out.println("사과개수 : " + Applecount);
	}
	
	
}
