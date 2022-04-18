package ch09;

//지역변수 {} 내에서 선언되는 변수
//		{}내에서 공간이 형성, {}를 벗어나면 공간 소멸
//		stack영역에서 저장

class C07Simple{
	int num = 10;
	void Func1() {
		System.out.println("num: " + num);
		int num = 20;
		System.out.println("num: " + num);
	}
	void Func2() {
		
		System.out.println("num: " + num);
		if (num > 0) {
			int num = 300;
			System.out.println("if문 안 num: " + num);
		}
		System.out.println("num: " + num);
	}
	void Func3() {
		int i = 1;
		while (i <= num) {
			int num = i;
			System.out.println("While 안의 num = "
					+ "" + num);
			i++;
		}
		System.out.println("num = " + num);
		
	}
}




public class C07LocalVar {
	public static void main(String[] args) {
		C07Simple testobj = new C07Simple();
		testobj.Func1();
		testobj.Func2();
		testobj.Func3();
		
	}
}
