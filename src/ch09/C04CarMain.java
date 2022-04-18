package ch09;

class C05car {
	public String owner;
	public int speed;
	public int fuel;
	
	//함수의 헤더
	public int Accel() {
			 //
		System.out.println(owner + " 가속합니다.");
		return 10;
	}
	
	
	public void Break() {
		System.out.println(owner + " 감속합니다.");
	}
	
	 
}
public class C04CarMain {
	
	public static void main(String[] args) {
		C05car c = new C05car();
		c.owner = "홍길동";
		c.Accel();
		c.Break();
	}
}
