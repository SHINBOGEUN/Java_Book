package ch24;

// 추상 클래스
// 강제성  write로 통일 시키고 몸통을 바꿔
// ex) 문방구 ->샤프	쓰다기능 write
//			->연필	쓰다기능 write

// ----------완성된 클래스-----------
class Super1{
	void Func1() {
		
	}
}
class Sub1 extends Super1{
	void Func1() {
		System.out.println("Sub에서 재정의한 Fucn1");
	}
}

//--------추상 클래스-------------
abstract class Super2{
	abstract void Func1();   // 추상 메서드 (함수 선언)
}

//강제성 - 무조건 하의클래스에서 추상메서드를 구현해야함!!
class Sub2 extends Super2{
	
	
	void Func1() {
		System.out.println("Sub2에서 재정의한 Func1");
	}
}

public class C01AbstractMain {
	public static void main(String[] args) {
		//일반 클래스
		Super1 ob1 = new Super1();
		Sub1 ob2 = new Sub1();
		
		//추상 클래스
//		Super2 ob3 = new Super2() // 불가능 미완성된 함수를 포함하고 있기 떄문에
		
		
		Sub2 ob4 = new Sub2();  //=> 물려받은 추상메서드를 정의했을때만 가능
			
		//
		Super2 up = new Sub2(); // Upcasting
		up.Func1();
			
				
		
		
		
	}
}
