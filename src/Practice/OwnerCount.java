package Practice;




public class OwnerCount {
	
	String owner; 
	int ATMmoney;
	
	public OwnerCount(String owner, int aTMmoney) {
		this.owner = owner;
		ATMmoney = aTMmoney;
	}



	//계좌 은행 계좌에 넣는다.
	int Account(int money) {
		ATMmoney -= money;
		return money;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		OwnerCount 대구은행 = new OwnerCount("신보근", 345000);
		
		
		
	}
	
}
