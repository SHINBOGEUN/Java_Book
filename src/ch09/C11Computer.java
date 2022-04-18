package ch09;
class C11Simple{
	String SN;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	int StartApp(String app1) {
		System.out.println(app1 +"을 실행합니다");
		return 1;
	}
	int StartApp(String app1, String app2) {
		System.out.println(app1 +" "+ app2 + "을 실행합니다");
		return 2;
	}
	void ShowInfo() {
		System.out.printf("Information \n %s\n%s\n%s\n%s",SN,CPUSpec,RAMSpec,DISKSpec);
	}
}
public class C11Computer {
	public static void main(String[] args) {
		
		
	}

}
