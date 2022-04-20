package Test;

class Position{
	int x;
	int y;
	
	public Position(int x) {
		this.x = x;
	}
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void showpos() {
		System.out.printf("x : %d, y : %d\n", x, y);
	}
	
}



public class PositionMain {
	public static void main(String[] args) {
		Position pos1 = new Position(10); 
		Position pos2 = new Position(30,40); 
	    pos1.showpos();
	    pos2.showpos();
	    
}
}
