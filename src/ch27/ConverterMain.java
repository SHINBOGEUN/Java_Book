package ch27;

import java.util.Scanner;

import ch22.problem;

abstract class Conveter{
	abstract protected double convert(double src); // 추상메서드
	abstract protected String getSrcString(); // 추상메서드
	abstract protected String getDesString(); // 추상메서드
	protected double ratio;
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDesString()+ "로 바꿉니다.");
		System.out.print(getSrcString()+ "을 입력 하세요 >>\n");
		double val = input.nextDouble();
		double res = convert(val);
		System.out.println("반환결과: " + res + getDesString()+ " 입니다");
	}
}
class Won2Dollar extends Conveter{
	int dolor;
	
	
	public Won2Dollar(int dolor) {
		super();
		this.dolor = dolor;
	}

	@Override
	protected double convert(double src) {
		return src / this.dolor;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDesString() {
		return "달러";
	}
	
	
}
class Km2Mile extends Conveter{
	double num1;
	
	public Km2Mile(double num1) {
		this.num1 = num1;
	}

	@Override
	protected double convert(double src) {
		return src/num1;
	}

	@Override
	protected String getSrcString() {
		return "Km";
	}
	@Override
	protected String getDesString() {
		return "mile";
	}
	
	
	
	
}



public class ConverterMain {
	public static void main(String[] args) {
//		Won2Dollar to = new Won2Dollar(1200);
//		to.run();
		
		
		
		Km2Mile to2 = new Km2Mile(1.6);
		to2.run();
	}
}
