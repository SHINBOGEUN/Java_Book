package ch09;

class C12Simple {
	int x;
	int y;
	void showXY() {
		System.out.printf("x = %d, y = %d", x ,y);
	}
	
	//생성시에 한번만 호출된다.
	//생성자 함수는 바환 자료형이 없다.
	//생성자명은 클래스명과 동일하다.
	//클래스 내에 생성자 함수를 명시하지 않았을때 컴파일러에 의해 삽입되는 기본생성자 함수가 있다.(디폴트 생성자 : 모든 맴버변수의 값을 0(Null)로 초기화
	public C12Simple() {
		System.out.println("디폴트 생성자 호출");
		x= 5;
		y= 5;
	}
}



public class C12ConstructionMain {
	public static void main(String[] args) {
		C12Simple test  = new C12Simple(); //디폴트 생성자 함수
		test.showXY();
	}
}
