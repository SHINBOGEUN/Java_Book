package ch19;



class Store{
	static double sales;
	String name;
	int colaprice;
	int coffeeprice;
	
	
	Store(String name, int colaprice, int coffeeprice) {
		this.name = name;
		this.colaprice = colaprice;
		this.coffeeprice = coffeeprice;
	}

	void ShowInfo() {
		System.out.println("-------------" + name + "---------------");
		System.out.println("커피 가격 : " + (coffeeprice * (1-sales)));
		System.out.println("콜라 가격 : " + (colaprice * (1-sales)));		
	}	
}




public class C03StaticMain {
	public static void main(String[] args) {
		//1 편의점 공통 할인율
		Store.sales = 0.2;
		Store GS감삼점 = new Store("GS감삼", 1000, 1000);
		Store GS반월당점 = new Store("GS반월당", 2000, 2000);
		Store GS동성로점 = new Store("GS동성로", 1500, 1500);
		
		GS감삼점.ShowInfo();
		GS반월당점.ShowInfo();
		GS동성로점.ShowInfo();
		
		//2 레스토랑 예약하기
		
		
		
		
		
	}
}
