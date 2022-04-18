package ch09;

public class C02Main {
	public static void main(String[] args) {
		C02Car h = new C02Car();
		
		h.owner = "홍길동";
		h.speed = 0;
		h.fuel = 100;
		
		System.out.println(h.owner);
		System.out.println(h.speed);
		System.out.println(h.fuel);
	}
}
