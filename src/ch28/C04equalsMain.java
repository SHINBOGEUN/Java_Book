package ch28;

import java.util.Objects;

class C04Simple{
	int x;
	int y;
	public C04Simple(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	@Override
	public boolean equals(Object obj) { //Object obj = (Object)obj2;
		if (obj instanceof C04Simple) {
			C04Simple down = (C04Simple) obj;
			return this.x == down.x && this.y == down.y;			
		}
		return false;
	}
}

public class C04equalsMain {
	public static void main(String[] args) {
		C04Simple ob1 = new C04Simple(10, 20);
		C04Simple ob2 = new C04Simple(10, 20);
		C04Simple ob3 = new C04Simple(10, 30);
		
		System.out.println("ob1.equals(ob2) ? " + ob1.equals(ob2));
		System.out.println("ob1.equals(ob3) ? " + ob1.equals(ob3));
		System.out.println("ob2.equals(ob3) ? " + ob2.equals(ob3));
	}
}
