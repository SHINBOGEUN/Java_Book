package ch23;

class Super1{
	int x ;
	void Func() {
		System.out.println("TEST");
	}
}

class Sub1 extends Super1{
	int y;

	@Override
	void Func() {
		System.out.println("Sub class TEST");
	}
	
	void ShowXY() {
		System.out.printf("x = %d, y = %d\n", x, y);
	}
	
}


public class C04UpcastingOverridding {
	public static void main(String[] args) {
		Super1 ob1 = new Super1(); // no casting
		Sub1 ob2 = new Sub1();// no casting
		Sub1 ob3 = new Sub1();// no casting
		// up casting
		Super1 ob4 = new Sub1();
//		ob4.y = 10;
//		ob4.ShowXY();
		
		
		//상속관계에서 오버라이딩을 했을때 접근 가능!!
		ob4.Func();
		
	}
}
