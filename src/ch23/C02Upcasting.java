package ch23;



class C02Super{
	int x;
	
}



class C02Sub extends C02Super{
	
	int y;
	
	
	
}


public class C02Upcasting {
	public static void main(String[] args) {
		//Casting : 클래스 자료형 변환 
		//
		C02Super ob1 = new C02Super();
		
		ob1.x = 10;
		
		C02Sub ob2 = new C02Sub();
		
		ob2.x= 20;ob2.y= 30;
		
		
		//Up Casting : 상위 클래스 참조변수 = 하위클래스 객체
		C02Super ob3 = new C02Sub();  //자동 형변환 상위클래스형의 맴버까지만 사용할 수 있다.
		
		ob3.x = 10;
		//ob3.y = 20; // 맴버는 존재하나 접근을 할 수 없다.
		
		
		
		
		//DownCasting : 하위클래스 참조변수 = 상위클래스
		//UPCasting 상태에서 확장된 맴버에 접근하기 위해 사용
		
		C02Sub down = (C02Sub)ob3;
		down.x = 10;
		down.y = 20;
		
		
	}
}
