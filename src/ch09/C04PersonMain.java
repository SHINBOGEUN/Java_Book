package ch09;

//주의! 메인클래스가 아닌 다른 클래스에는 접근한정자를 붙이지 않는다.

class C04Person{
	
	String name;
	int age;
	float height;
	double weight;
	
	void talk() {
		System.out.println(name + "님이 말합니다.");
	}
	void walk() {
		System.out.println(name + "님이 걷습니다.");
	}
}

// 주의! main메서드를 포함한 java파일명과 class명은 일치해야한다.
public class C04PersonMain {
		
	
	public static void main(String[] args) {
		C04Person o = new C04Person();
		
		
		o.talk();
		o.walk();
		
		
	}

}
