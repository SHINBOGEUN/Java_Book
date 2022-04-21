package 사과장수1;

public class Main {
	public static void main(String[] args) {
		Store 바나나장수 = new Store(100, 540000, 2000);
		
		Customer 신보근 = new Customer(0, 10000000);
		Customer 손필욱 = new Customer(0, 1000000);
		Customer 한창민 = new Customer(0, 100000);
		Customer 김민수 = new Customer(0, 10000);
		Customer 최문기 = new Customer(0, 1000);
		
		System.out.println("신보근");
		신보근.Pay(바나나장수, 10000);
		신보근.ShowInfo();
		System.out.println();

		System.out.println("손필욱");
		손필욱.Pay(바나나장수, 10000);
		손필욱.ShowInfo();
		System.out.println();

		System.out.println("김민수");
		김민수.Pay(바나나장수, 10000);
		김민수.ShowInfo();
		System.out.println();
		
		System.out.println("한창민");
		한창민.Pay(바나나장수, 10000);
		한창민.ShowInfo();
		System.out.println();

		System.out.println("최문기");
		최문기.Pay(바나나장수, 1000);
		최문기.ShowInfo();
		System.out.println();
		
		System.out.println("바나나 장수");
		바나나장수.ShowInfo();

	}
}
