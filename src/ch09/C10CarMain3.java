package ch09;



class C10car {
	public String owner;
	public int speed;
	public int fuel;
	public String cupholder1;
	public String cupholder2;
	
	
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
public class C10CarMain3 {
	
	public static void main(String[] args) {
		C10car c = new C10car();
		c.owner = "홍길동";
		c.speed = 150;
		c.fuel = 20;
		c.cupholder1 = "커피";
		c.cupholder2 = "물";
		
		
		c.ShowInfo();
		
		
			
		
		
	}
}
