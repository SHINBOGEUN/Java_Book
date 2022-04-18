package ch09;

class C14Simple1{
	String SN;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	
	
	C14Simple1(String SN, String CPU, String RAM, String DISK  ) {
		this.SN = SN;
		this.CPUSpec = CPU;
		this.RAMSpec = RAM;
		this.DISKSpec = DISK;
	}
	
	
	
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

public class C14ComputerMain {
	public static void main(String[] args) {
		C14Simple1 Lggram123 = new C14Simple1("1-2-3-4","I7","16G","1TB");

		
		Lggram123.StartApp("Chrome URL:www.naver.com");
		Lggram123.StartApp("Excel 1.xls", "NotePad");
		Lggram123.ShowInfo();
	}

}

