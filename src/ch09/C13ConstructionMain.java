package ch09;

class C13Simple{
	
	int var1;
	double var2;
	char var3;
	String var4;
	boolean var5;
	
	public C13Simple() {
		
	}
}
public class C13ConstructionMain {
	public static void main(String[] args) {
		C13Simple ob = new C13Simple();
		System.out.println("var1 = " + ob.var1);
		System.out.println("var2 = " + ob.var2);
		System.out.println("var3 = " + ob.var3);
		System.out.println("var4 = " + ob.var4);
		System.out.println("var5 = " + ob.var5);
	}
}
