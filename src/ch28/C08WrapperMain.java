package ch28;

public class C08WrapperMain {

	public static void main(String[] args) {
		//Boxing
		Integer ob1 = new Integer(100);
		Integer ob2 = new Integer("200");
		Integer ob3 = new Integer("300");
		
		
		//UNBoxing
		int val1 = ob1.intValue();
		int val2 = ob2.intValue();
		int val3 = ob3.intValue();
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
	}

}
