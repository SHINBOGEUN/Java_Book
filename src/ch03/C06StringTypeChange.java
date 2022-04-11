package ch03;

public class C06StringTypeChange {
	public static void main(String[] args) {
		
		//문자열 + 문자열
//		System.out.println("String1 " + "String2");
//		System.out.println("String1" + ", "+ "String2");
//		System.out.println("String1 " + 2);
//		System.out.println(1 + 2 * 3 + " String");
//		
//		-----------------------------------------------
		//문자열 >> 숫자형
//		-----------------------------------------------
		

			System.out.println("10" + "30");
	        int n1 =Integer.parseInt("10");
	        int n2 =Integer.parseInt("20");
	        //Integer.parseInt >>> 문자열을 숫자형으로 변환

	        System.out.println(n1 + n2);

	        double n3 =Double.parseDouble("10.5");
	        double n4 =Double.parseDouble("20.7");
	        //Double.parseDouble >>> 문자열을 실수형으로 변환

	        System.out.println(n3 + n4);
	        
	        //Short.parseShort("");
	        //Byte.paeseByte("");
		
		
	        
	        
	        
	        int ival = 10;
	        double dval = 3.14;
	        
	        System.out.println(ival + dval);
	        
	        String str1 = String.valueOf(ival);
	        String str2 = String.valueOf(dval);
	        System.out.println(str1 + str2);
	}

}