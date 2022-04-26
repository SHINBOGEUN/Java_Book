package ch19;

class Calculator{
	int x;
	int y;
	private static Calculator instance = new Calculator();
	private Calculator() {
		
	}
	public static Calculator getInstance() {
		return instance;
	}
	
	void sum() {
		System.out.println("sum : "+ (x + y));
	}
	void sub() {
		System.out.println("sub : " + (x - y));
	}
	void Mul() {
		System.out.println("Mul : "+ (x * y));
	}
	void Div() {
		System.out.println("Div : "+ ((double)x / y));
	}
	
	
	
}


public class C06SingleTonPattern {
	public static void main(String[] args) {
		Calculator cal1 = Calculator.getInstance();
		Calculator cal2 = Calculator.getInstance();
		
		cal1.x = 10;
		cal1.y = 20;
		
		cal1.sum();
		cal2.sub();
		cal2.Div();
		cal2.Mul();
		
	}
}
