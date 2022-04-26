package ch30;
class Person{
	String name;
	String addr;
	public Person(String name, String addr) {
		this.name = name; this.addr = addr;
		}
	@Override
	public String toString() {
		return "[name=" + name + ", addr=" + addr + "]";
	}
	
}
class Simple<T>{
	T x;
	T y;
	public Simple(T x, T y) {
		this.x = x;
		this.y = y;
	}
	void ShowMeber() {
		System.out.println("X  = " + x + " Y = " + y );
	}
}

public class C01SimpleGenericMain {
public static void main(String[] args) {
	Simple ob1 = new Simple<Integer>(10, 20);
	ob1.ShowMeber();
	System.out.println();
	Simple ob2 = new Simple<String>("홍길동", "이상민");
	ob2.ShowMeber();
	System.out.println();
	
	Simple ob3 = new Simple<Person>(new Person("정우균", "대구"), new Person("홍길동", " 서울"));
	ob3.ShowMeber();
}

}
