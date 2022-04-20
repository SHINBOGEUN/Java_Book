package Test;

class Person{
	String name;
	int age;
	String addr;
	
	public Person(String _name, int _age, String _addr) {
		this.name = _name;
		this.age = _age;
		this.addr = _addr;
	}
	
	void showinfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
	}
}



public class PersonMain {
	public static void main(String[] args) {
		Person jung = new Person("홍길동", 44, "대구");
		jung.showinfo();
		
	}	
}
