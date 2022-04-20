package ch13;

//나이 이름 성별 취미 연봉 주소;

//public		: 모든 패키지에서 사용가능
//default		: 현재 패키지에서만 가능하다
//protected		: 상속관계 전제하여 하위클래스 사용가능
//private		:해당 클래스 내에서만 사용가능



class Person{
	public String name;
	
	private int age;
	private float weight;
	private double height;
	
	
	
	public Person(String name, int age, float weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}



	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	
}


public class C01InforHide {
	public static void main(String[] args) {
		Person hong = new Person("홍길동", 30, 70.8f, 177.5);
		
	
		hong.setAge(13);
		System.out.println("나이 : " + hong.getAge());
		
		hong.setWeight(88.5f);
		hong.setHeight(179.5);
		
		System.out.println(hong.getHeight());
		System.out.println(hong.getWeight());
		
		
	}

}
