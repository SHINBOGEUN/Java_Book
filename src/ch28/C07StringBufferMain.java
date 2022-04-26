package ch28;

import java.nio.Buffer;

public class C07StringBufferMain {
	public static void main(String[] args) {
//		String str1 = "java";
//		String str2 = "Android";
//		
//		System.out.println(str1);
//		System.out.printf("%x\n",System.identityHashCode(str1)); 
//		
//		
//		str1 = str1.concat(str2);
//		System.out.println();
//		System.out.println(str1);
//		System.out.printf("%x\n",System.identityHashCode(str1)); 
		
		
		StringBuffer str1 = new StringBuffer("JAVA");
		
		System.out.printf("%x\n",System.identityHashCode(str1)); 
		System.out.println(str1);
		System.out.println();
		
		str1.append(" and ");
		str1.append("ADROID");
		System.out.printf("%x\n",System.identityHashCode(str1)); 
		System.out.println(str1);
		System.out.println();
		
		
		
	}
}
