package Test;

class Rectangle{
	int x;
	int y;
	int width;
	int height ;
	
	public Rectangle() {
		x = 0;
		y = 0;
		width = 0;
		height  = 0;
	}
	public Rectangle(int _x, int _y, int _width, int _height ){
		this.x = _x;
		this.y = _y;
		this.width = _width;
		this.height  = _height ;
	}
	void show() {
		System.out.printf("좌표 = (%d, %d), 넓이=%d\n",x,y,width,height);
	}
	
	
	int square() {
		return  width * height ;
	}
	
	boolean contains(Rectangle r) {
		if (this.x < r.x && this.y < r.y) {
			if (r.x + r.width <= x + width && r.y + r.height <= y + height) {
				return true;
				}
		}
		return false;
		
	}
	
}



public class RectangleMain {
	public static void main(String[] args) {
		  Rectangle r = new Rectangle(2, 2, 8, 7);
		  Rectangle s = new Rectangle(5, 5, 6, 6);
		  Rectangle t = new Rectangle(1, 1, 10, 10);
		  
		  
		  r.show();
		  System.out.println("s의 면적은 "+s.square());
		  if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		  if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}
}
