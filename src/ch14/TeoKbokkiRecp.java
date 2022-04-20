package ch14;



class cook{
	
	int a;
	
	
	
	
	TeokbokkiRecp1 tbk;
	public cook() {
		tbk = new TeokbokkiRecp1();
	}

	
}


class TeokbokkiRecp1{
	private void cookingOrder() {System.out.println("밀떡을 물에 살짝 헹궈 체둔다.");}
	private void cookingOrder1() {System.out.println("어묵은 원하는 크기로 적당히 썰어준다. ");}
	private void cookingOrder2() {
		System.out.println("냄비에 불에 올린 뒤 물을 넣고 멸치가루와 다시마, 밀떡, 크게 썬 대파, 간장, 어묵 등 각종 재료를 한거번에 넣은 뒤 팔팔 끓인다.");
	}
	public void cooking() {
		System.out.println("조리 순서 출력");
		cookingOrder();
		cookingOrder1();
		cookingOrder2();
	}
	
}

public class TeoKbokkiRecp {
	public static void main(String[] args) {
		cook c = new cook();
		c.tbk.cooking();
		
	}
}
