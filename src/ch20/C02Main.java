package ch20;

class Super{
	int x;
	int y;
	Super(){System.out.println("Super()생성자 호출");this.x=0; this.y = 0;}
	Super(int x){System.out.println("Super(x)생성자 호출");this.x=x; this.y = 0;}
	Super(int x , int y){System.out.println("Super(x, y)생성자 호출");this.x=x; this.y = y;}
	
}

class Sub extends Super{
	int z;
	Sub(){
		System.out.println("Sub()생성자 호출");
	}
	
	Sub(int x){
		super(x); 
		System.out.println("Sub(x)생성자 호출");
	}
	
	Sub(int x , int y){
		super(x, y);
		System.out.println("Sub(x, y)생성자 호출");
	}
	
	Sub(int x, int y, int z){
		super(x,y);
		System.out.println("Sub(x, y, z)생성자 호출");
	}
	
	
	void ShowXYZ() {
		System.out.printf("%d %d %d \n" , x, y, z);
	}
}



public class C02Main {
	
	public static void main(String[] args) {
		//Sub ob1 = new  Sub();
		//Sub ob2 = new  Sub(10);
//		Sub ob3 = new  Sub(10, 20);
//		ob3.ShowXYZ();
		Sub ob4 = new  Sub(10, 20, 30);
		ob4.z=30;
		ob4.ShowXYZ();

	}
}
