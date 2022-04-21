package ch19;

class Rectangle{
	static int x;
	static int y;
	int width;
	int height;
	
	public Rectangle(int width, int height) {
		this.width =width;
		this.height = height;
		
	}
	//끝점확인
	void ShowEndPoint() {
		System.out.printf("끝점 확인 = (%d, %d)\n",width+x, height+y );
		
		
	}
	
	//시작점 너비 높이 끝점확인
	void ShowInfo() {
		System.out.printf("시작점 = (%d, %d)\n", x, y);
		System.out.printf("너비 = %d 높이 = %d\n",width,height);
		System.out.printf("끝점 확인 = (%d, %d)\n",width+x, height+y );
		System.out.println("넓이 = " + (width * height));
		System.out.println();
	}
	
}


public class C02StaticMain {
	public static void main(String[] args) {
		Rectangle.x=10;
		Rectangle.y=20;
		
		
		Rectangle rec1 = new Rectangle(10, 10);
		Rectangle rec2 = new Rectangle(5, 7);
		Rectangle rec3 = new Rectangle(6, 5);
		
		
		
		rec1.ShowInfo();
		rec2.ShowInfo();
		rec3.ShowInfo();
				
		
	}
}
