package ch26;

interface Remocon{
	int MAXVOL = 100;	//public static final
	int MINVOL = 0;		//public static final
	void On(); 		 	//추상 메서드
	void Off();			//추상메서드
	void SetVOl(int num); //추상 메서드 (볼륨 설정값을 받을수 있게)
}




class TV implements Remocon{
	int volumn;
	@Override
	public void On() {	
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void Off() {
		System.out.println("TV를 끕니다.");
	}
	@Override
	public void SetVOl(int num) {
		if (num > MAXVOL) {
			volumn = MAXVOL;	
		}else if (num < MINVOL) {
			volumn = MINVOL;	
		}else {
			volumn = num;	
		}
	}
}



class Radio implements Remocon{
	int volumn;
	@Override
	public void On() {
		System.out.println("라디오를 켭니다.");
	}

	@Override
	public void Off() {
		System.out.println("라디오를 끕니다.");
		
	}
	@Override
	public void SetVOl(int num) {
		if (num > MAXVOL) {
			volumn = MAXVOL;	
		}else if (num < MINVOL) {
			volumn = MINVOL;	
		}else {
			volumn = num;	
		}
		
	}
	
}
public class C01InterfaceMain {
	
	public static void 아빠의오른팔(Remocon controller, int num) { // Remocon controller = new TV()
		controller.On();							  		   // Remocon controller = new Radio()
		controller.Off();
		controller.SetVOl(num);
		System.out.println();
	}
	public static void main(String[] args) {
		아빠의오른팔(new TV(), 101);
		아빠의오른팔(new Radio(), 20);
		
	}
}
