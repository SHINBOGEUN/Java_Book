package ch21;

class computer{
	public String SN;
	public String CPUSpec;
	public String RAMSpec;
	public String DISKSpec;
	
	
	//생성
	public computer(String sN, String cPUSpec, String rAMSpec, String dISKSpec) {
		super();
		SN = sN;
		CPUSpec = cPUSpec;
		RAMSpec = rAMSpec;
		DISKSpec = dISKSpec;
		System.out.println("컴퓨터 생성자 호출");
		
		
		
		
	}
	public void PowerON() {
		System.out.println("전원을 켭니다.");
	}
	public void PowerOFF() {
		System.out.println("전원을 끕니다.");
	}
	public void ShowInfo() {
		System.out.println("SN : "  + SN);
		System.out.println("CPU : "  + CPUSpec);
		System.out.println("RAM : "  + RAMSpec);
		System.out.println("DISK : "  + DISKSpec);
		
	}
	
}

class NoteBook extends computer{
	public int battery;
	
	public NoteBook(String sN, String cPUSpec, String rAMSpec, String dISKSpec, int battery) {
		super(sN,cPUSpec,rAMSpec,dISKSpec);
		this.battery = battery;
	}
	
	public void Move() {
		if(battery -5 < 0) {
			System.out.println("배터리가 부족합니다.");
		}else {
			System.out.println(SN + "노트북이 이동됩니다.");
		}
	}
	
}


public class C01problem {
	public static void main(String[] args) {
		NoteBook LG = new NoteBook("1-2-3-4", "I7", "16G", "1T", 100);
		LG.ShowInfo();
		LG.PowerON();
		LG.Move();
		LG.PowerOFF();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
