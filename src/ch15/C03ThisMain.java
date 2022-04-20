package ch15;

class C03Simple{
	
	int x;
	int y;
	int z;
	public C03Simple() {
//		System.out.println("C03Simple() 호출");
//		x = 0;
//		y = 0;
//		z = 0;
		this(0,0,0);
	}
	
	public C03Simple(int x) {
//		System.out.println("C03Simple(int x) 호출");
//		this.x = x;
//		y = 0;
//		z = 0;
		this(x,0,0);
	}
	
	
	public C03Simple(int x, int y, int z) {
		System.out.println("C03Simple(int x, int y, int z) 호출");
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public C03Simple(int x, int y) {
		super();
		System.out.println("C03Simple(int x, int y) 호출");
		this.x = x;
		this.y = y;
		z = 0;
	}
	
	
	
}


public class C03ThisMain {
	public static void main(String[] args) {
		C03Simple obj1 = new C03Simple();
		C03Simple obj2 = new C03Simple(10);
		C03Simple obj3 = new C03Simple(10, 20);
		C03Simple obj4 = new C03Simple(10, 20, 30);
		
		
		
		
		
		
	}
}
