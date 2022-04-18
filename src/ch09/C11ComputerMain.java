package ch09;

public class C11ComputerMain {
	public static void main(String[] args) {
		C11Simple Lggram123 = new C11Simple();
		Lggram123.SN = "1-2-3-4";
		Lggram123.CPUSpec = "I7";
		Lggram123.DISKSpec = "1Tb";
		Lggram123.RAMSpec = "16G";
		
		
		
		Lggram123.StartApp("Chrome URL:www.naver.com");
		Lggram123.StartApp("Excel 1.xls", "NotePad");
		Lggram123.ShowInfo();
	}

}

