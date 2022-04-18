package ch09;



class C08car {
	public String owner;
	public int speed;
	public int fuel;
	
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
public class C08CarMain2 {
	
	public static void main(String[] args) {
		C08car c = new C08car();
		c.owner = "홍길동";
		c.speed = 150;
		c.fuel = 20;
		
		
		while(true) {
			
			try {
			Thread.sleep(500);
			c.Break();
			}catch (Exception e) {
				
			}
		}
		
			
		
		
	}
}
