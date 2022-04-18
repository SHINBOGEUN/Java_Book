package ch09;
import java.util.*;
class C06Simple{
	
	int x ;
	int y ;
	
	void ShowXY() {
		System.out.println("X = " + x + ",Y = " + y);
	}
	
	
	
	//생성자
	public C06Simple(int _x, int _y) {
		this.x = _x;
		this.y = _y;
	}

	
	
	
	
	
}


public class C06SimpleMethod {
	//크
	public static void Addmember(C06Simple obj, int x, int y) {
		obj.x = x;
		obj.y = y;
		
	}
	public static int subMember(C06Simple obj) {
		//다른 지역으로 객체의 위치를 받아 Simple객체 맴버의 차를 return;
//		Scanner input = new Scanner(System.in);
//		obj.x = input.nextInt();
//		obj.y = input.nextInt();
		if (obj.x > obj.y) {
			return obj.x - obj.y;
		}else {
			return obj.y -obj.x;
		}
		
		
		
	}
	public static void main(String[] args) {
		C06Simple testobj = new C06Simple(10, 20);
		
		testobj.ShowXY();
		
		
		
		int result = subMember(testobj);
		System.out.println("두수의 차 : " + result);
		
	}

}
