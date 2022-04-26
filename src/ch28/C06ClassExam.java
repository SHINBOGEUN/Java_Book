package ch28;

public class C06ClassExam {
	public static void main(String[] args) {
		// 방법 1
//		Class c1 = Person.class;
		
		// 방법 2
//		Class c1 =null;
//		try {
//			c1 = Class.forName("ch28.Person");  // 메모리 적재 시킬때  
//			
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
		// 방법 3
		
		Person obj = new Person("홍길동", "대구", 22);
		Class c1 = obj.getClass();
		
		
		//확인
		System.out.println(c1.getName());
		System.out.println(c1.getSimpleName());
		System.out.println(c1.getPackage().getName());
	}
}
