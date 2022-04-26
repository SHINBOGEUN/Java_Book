package ch23;


//오버로딩
// -> 같은 클래스에 있는 동일한 메서드를 매개변수 개수를 다르게 만드는것



//오버라이딩
// -> 부모 클래스에 상속을 받은 자식클래스가 부모의 메서드를 가져와 재정의 하는것
// -> 상속받은 메서드의 내용만 변경




class Animal{
	void sound() {
		System.out.println("소리를 냅니다.");
	}
}



class Dog extends Animal{
	void sound() {
		System.out.println("강아지가 소리를 냅니다.");
	}
}


class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("고양이가 소리를 냅니다.");
	}
	
}


public class C01OverridingMain {
	public static void main(String[] args) {
		Dog poppi = new Dog();
		Cat yummi = new Cat();
		
		poppi.sound();
		yummi.sound();
	}
}
