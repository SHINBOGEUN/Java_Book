package ch14;


class Person{
	String name;
	String addr;
	int age;
	
	Person() {
		this("없음", "없음", 0);
	}
	Person(String n,String a){
		 this(n,a,0);
	}
	public Person(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	
	
	
}






public class test1 {
	public static void main(String[] args) {
		Person kim = new Person();
		Person Lee = new Person("이지성","서울특별시");
		Person Son = new Person("손민수","대구광역시",20);

	}
}
