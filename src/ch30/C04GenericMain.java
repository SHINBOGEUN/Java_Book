package ch30;


class C04Simple<K,T> {
	K x;
	T y;
	public C04Simple(K x, T y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "C04Simple [x=" + x + ", y=" + y + "]";
	}
	
}



public class C04GenericMain {
	public static void main(String[] args) {
		C04Simple<Integer,Double> ob1 = new C04Simple(10, 10.2);
		System.out.println(ob1.toString());
		
		
		C04Simple<Character,String> ob2 = new C04Simple("가", "Hello world");
		System.out.println(ob2.toString());
		
		
		C04Simple<String, Person> ob3 = new C04Simple("KEY1", new Person("홍기동", "대구"));
		System.out.println(ob3.toString());
		
	}
}
