package ch09;
class C14Simple{
	int x;
	int y;
	int z;
	
	
	//this 만들어진 이 객체
	public C14Simple() {
		System.out.println("디폴트 생성자 호출!");
		x = 0; y = 0; z = 0;
	}
	public C14Simple(int x) {
		System.out.println("C14Simple(int x) 생성자 호출");
		this.x = x; y = 0; z = 0;
	}
	public C14Simple(int x, int y) {
		System.out.println("C14Simple(int x, int y) 생성자 호출");
		this.x = x; this.y = y; z = 0;
			
	}
	public C14Simple(int x, int y, int z) {
		System.out.println("C14Simple(int x, int y, int z) 생성자 호출");
		this.x = x; this.y = y; this.z = z;
	}
	void ShowInfo(){
		System.out.printf("x = %d, y = %d, z = %d\n", x, y, z);
	}
	
	
	
	
	
	
	
	
}
public class C14ConstructionMain {

	public static void main(String[] args) {
		C14Simple ob = new C14Simple();
		ob.ShowInfo();
		C14Simple ob1 = new C14Simple(10);
		ob1.ShowInfo();
		C14Simple ob2= new C14Simple(10,20);
		ob2.ShowInfo();
		C14Simple ob3 = new C14Simple(10,20,30);
		ob3.ShowInfo();
		
		
	}

}
