package Test;
import java.util.Scanner;


class Grade{
	int math;
	int science;
	int english;
	
	public Grade(int _math, int _science, int _english) {
		this.math = _math;
		this.science = _science;
		this.english = _english;
	}
	
	int average() {
		return (math + science + english) / 3;
	}
	
}




public class GradeMain {
	
	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int math = sc.nextInt();
		  int science = sc.nextInt();
		  int english = sc.nextInt();
		  Grade me = new Grade(math, science, english);
		  System.out.println("평균은 "+me.average()); // average()는 평균을 계산하여 리턴
		   
		  sc.close();
	}
}
