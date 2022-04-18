package ch09;



class C14car {
	public String owner;
	public String model;
	public int speed;
	public int fuel;
	public String cupholder1;
	public String cupholder2;
	
	public C14car(String own, String mo, int fu, int _speed, String _cupholder1, String _cupholder2) {
		this.owner = own;
		this.model = mo;
		this.fuel =fu;
		this.speed = _speed;
		this.cupholder1 = _cupholder1;
		this.cupholder2 = _cupholder2;
	}
	
	public C14car(String own, String mo, int _fuel, int _speed, String _cupholder1) {
		this.owner = own;
		this.model = mo;
		this.fuel =_fuel;
		this.speed = _speed;
		this.cupholder1 = _cupholder1;
		
	}
	public C14car(String own, String mo, int _fuel, int _speed) {
		this.owner = own;
		this.model = mo;
		this.fuel =_fuel;
		this.speed = _speed;
	}
	void CarShowInfo() {
		System.out.println("소유자 : " + owner);
		System.out.println("모델 : " + model);
		System.out.println("연료량 : " + fuel);
		System.out.println("속도 : " + speed);
		System.out.println("홀더 1 : " + cupholder1);
		System.out.println("홀더 2 : " + cupholder2);

	}
	
	
	
	
	
	
	void AddCupholder(String b1) {
		this.cupholder1 = b1;
	}
	void AddCupholder(String b1, String b2) {
		this.cupholder1 = b1;
		this.cupholder1 = b2;	}
	
	void ShowInfo() {
		System.out.println("소유자 = " + owner);
		System.out.println("현재 속도 = "+ speed);
		System.out.println("연료량 = " + fuel);
		System.out.println("CUP1 = " + cupholder1);
		System.out.println("CUP2 = " + cupholder2);
	}
	
	
	//함수의 헤더
	public void Accel() {
		if (fuel -5 < 0) {
			System.out.println("연료량 0 가속불가입니다.");
			return;
		}else {
			fuel -= 5;
		}
		
		
		if (speed + 10 > 200) {
			System.out.printf("%s 님 차량 최대속도 입니다.",owner);
		}else  {
			speed = speed + 10;
			System.out.printf("%s 님 차량 가속. Fuel =%d, 시속 = %dkm/h\n",owner, fuel, speed);
		}
		
	}
		
	
	
	public void Break() {
		
		if (speed - 10 <= 0) {
			speed = 0;
			System.out.printf("현재속도 %d km/h \n",speed);
			System.exit(-1);
		}else {
			speed -= 10;
			System.out.printf("현재속도 %d km/h \n",speed);
		}
	}
	
	 
}
public class C14CarMain {
	
	public static void main(String[] args) {
		C14car mycar1 = new C14car("홍길동", "아반뗴", 0, 100, "식혜", "수정과");
		mycar1.CarShowInfo();
		System.out.println();
		C14car mycar2 = new C14car("홍길동", "펠리세이드", 0, 100, "아아");
		mycar2.CarShowInfo();
		System.out.println();
		C14car mycar3 = new C14car("홍길동", "그렌저", 0, 100);
		mycar3.CarShowInfo();
		
			
		
		
	}
}
