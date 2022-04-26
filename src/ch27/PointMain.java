package ch27;

class Point{
	private int x, y;
	public Point(int x, int y ) {
		this.x = x;
		this.y = y;
	}
	public Point() {
		
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	
}

class ColorPoint extends Point{
	String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	void setXY(int x , int y) {
		move(x, y);
	}	
	void setColor(String col) {
		this.color = col;
	}
	public String toString() {
		
		return color + "색의(" + getX() +","+ getY() +") 점";
	}
	
}

class Point3D extends Point{
	int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	void setXY(int x , int y) {
		move(x, y);
	}
	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ", "+ z + ")" + "의 점입니다" ;
	}
	
	void moveUp() {
		z += 1;
	}
	
	void moveDown() {
		z -= 1;
	}
	void move(int x, int y, int z) {
		move(x, y);
		this.z =z;
	}
}


class PositivePoint extends Point{
	
	PositivePoint(int x, int y){
		super(x, y);
		if (x < 0 || y < 0) {
			move(0,0);
		}
	}
	PositivePoint() {
		super();	
	}
	@Override
	public void move(int x, int y) {
		if (x < 0 || y < 0) {
			return;
		}
		super.move(x, y);
	}
	
	
	
	public String toString() {
		return  "(" + getX() +","+ getY() +") 점";
	}
	
}
public class PointMain {
	public static void main(String[] args) {
//		ColorPoint cp = new ColorPoint(5,5,"Yellow");
//		
//		cp.setXY(10, 20);
//		cp.setColor("RED");
//		String str = cp.toString();
//		System.out.println(str + "입니다.");
//		ColorPoint zero = new ColorPoint(0, 0, "Black");
//		System.out.println(zero.toString()+ "입니다.");
//		ColorPoint cp = new  ColorPoint(10, 10, "black");
//		cp.setXY(5,5);
//		cp.setColor("RED");
//		System.out.println(cp.toString()+"입니다.");
		
//		Point3D p = new Point3D(1,2,3);
//		System.out.println(p.toString());
//		p.moveUp();
//		System.out.println(p.toString());
//		p.moveDown();
//		p.move(10, 10);
//		System.out.println(p.toString());
//		p.move(100, 200, 300);
//		System.out.println(p.toString());
		
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString()+ "입니다.");
		p.move(-5, 5);
		System.out.println(p.toString()+ "입니다.");
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString()+ "입니다.");
		
		
	}
}
