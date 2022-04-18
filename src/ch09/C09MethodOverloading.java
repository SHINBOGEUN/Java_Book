package ch09;

// 함수 오버로딩
// 메서드 이름은 동일하디만 여러 매개변수를 지정할 수 있도록 허용한 문법
// 메소드 이름이 동일
// 매개뱐수의 개수 or 자료형이 달라야한다.
// 반환자료형과 동일해야 한다.


class C09Simple{
	
	
	int sum(int x, int y) {
		return x + y;
	}
	//메소드 오버로딩
	
	int sum(int x, int y, int z) {
		return x + y + z;
	}
	//메소드 오버로딩
	double sum(int x, double y, float z) {
		return x + y + z;
	}
	String sum(String str1, String str2) {
		return str1 + str2;
	}
}


public class C09MethodOverloading {
	public static void main(String[] args) {
		C09Simple ob = new C09Simple();
		System.out.println("sum(int x, int y) : " + ob.sum(10, 20));
		System.out.println("sum(int x, int y, int z) : " + ob.sum(10, 20, 30));
		System.out.println("sum(double x, double y) : " + ob.sum(3, 10.3, 31.5f));
		System.out.println(ob.sum("하이", "안녕"));
	}

}
