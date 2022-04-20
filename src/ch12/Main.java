package ch12;

public class Main {
	public static void main(String[] args) {
		SellerStore col = new SellerStore(1000000, 100, 1000);
		
		BuyerStroe 신보근 = new BuyerStroe(100000, 0);
		BuyerStroe 손필욱 = new BuyerStroe(100000, 0);
		BuyerStroe 한창민 = new BuyerStroe(100000, 0);
		BuyerStroe 김민수 = new BuyerStroe(100000, 0);
		BuyerStroe 최문기 = new BuyerStroe(100000, 0);
		
		신보근.Pay(9000, col);
		손필욱.Pay(10000, col);
		한창민.Pay(11000, col);
		김민수.Pay(12000, col);
		최문기.Pay(13000, col);
		
		col.ShowInfo();
		System.out.println();
		
		신보근.ShowInfo();
		손필욱.ShowInfo();
		한창민.ShowInfo();
		김민수.ShowInfo();
		최문기.ShowInfo();

		
		
		
		
		
	}
}
