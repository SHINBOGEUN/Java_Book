package ch23;



class A{
	int a;
}

class B extends A{
	int b;
}

class C extends A{
	int c;
}

class D extends B{
	int d;
}

class E extends D{
	int e;
}

class F extends E{
	int f;
}

class G extends D{
	int g;
}


public class C03InstanceOFfMain {
	
	public static void UpDownFunc(A obj) { //A obj = new B(); Upcasting
		
		
		//DownCasting
		if (obj instanceof B) {  //instanceof : 객체 타입확인 에약어(형변환 가능여부 true/false)
			B down = (B)obj;//DownCasting B
			down.a = 10;
			down.b = 20;
			System.out.printf("a = %d, b = %d\n", down.a, down.b);
		}else if (obj instanceof C) {
			C down = (C)obj;   //DownCasting B
			down.a = 11;
			down.c = 30;
			System.out.printf("a = %d, c = %d\n", down.a, down.c);
		}
	}
	
	
	public static void main(String[] args) {
		UpDownFunc(new B());
		UpDownFunc(new C());
	}
}
