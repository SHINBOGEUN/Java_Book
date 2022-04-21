package 사과장수1;

public class Customer {

	int C_banana;
	int C_money;
	
	
	public Customer(int c_banana, int c_money) {
		super();
		C_banana = c_banana;
		C_money = c_money;
	}
	
	
	void Pay(Store s, int money) {
		int cnt = s.Receive(money);
		if (cnt != 0 ) {
			C_money -= money;
		}
		C_banana += cnt;
	}
	
	void ShowInfo() {
		System.out.println("보유금액 : " + C_money);
		System.out.println("바나나개수 : " + C_banana);
	}
	
	
	
	
}
