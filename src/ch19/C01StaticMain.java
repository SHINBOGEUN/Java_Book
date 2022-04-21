package ch19;

//스태틱
//자바 메모리 구조
//1) Strack
//	{} 내에서 선언되어지는 변수,{}벗어나면 소멸 //지역 변수
//2) Heap
//	객체 저장용 공간 //new 예약어 생성 + 참조변수, 참조변수연결 해재시 GC에 의해 소멸
//3) Class(==Method)
// 	공유메모리 영역 // 생성자 함수 //일반 함수//static함수// static변수
//
//


class Simple{
	static int x; //공유메모리영역에 적재 
	int y;
	
	
	void ShowXy() {
		System.out.println("X = " + x + "Y = " + y);
	}
}


public class C01StaticMain {
	public static void main(String[] args) {
		
		
		//static 맴버는 클래스명으로 접근가능
		Simple ob1  = new Simple();
		Simple ob2  = new Simple();
		Simple.x = 123;
		
		
		
		ob1.ShowXy();
		ob2.ShowXy();
	}
}
