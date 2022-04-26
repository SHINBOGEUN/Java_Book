package ch20;

class point2D{
	int x;
	int y;
	public point2D() {
		System.out.println("point2D 생성자 호출");
	}
	
	void ShowXY() {
		System.out.println("X : " + x +" Y : "+ y);
	}
}

class point3D extends point2D{
	
	int z;
	public point3D() {
		System.out.println("point3D 생성자 호출");
	}
	void ShowXYZ() {
		ShowXY();
		System.out.println("Z = " + z);
	}
	
}


public class C01상속InheritanceMain {
	public static void main(String[] args) {
		point3D n1 = new point3D();
		n1.x = 10;
		n1.y = 10;
		n1.z = 30;
		n1.ShowXYZ();
		
	}
}
