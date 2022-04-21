package 사과장수1;

public class Store {
	int S_banana;
	int S_money;
	int S_price;
	
	
	public Store(int s_banana, int s_money, int s_price) {
		super();
		S_banana = s_banana;
		S_money = s_money;
		S_price = s_price;
	}
	
	
	 int Receive(int money) {
		if (money < S_price) {
			System.out.println("돈이부족합니다.");
			return 0;
		}else {
			S_money += money;
			int cnt = money /S_price;
			S_banana -= cnt;
			return cnt;
		}
		
	}
	
	void ShowInfo() {
		System.out.println("보유금액 : " + S_money);
		System.out.println("바나나개수 : " + S_banana);
	}
	
	
	
	
}
