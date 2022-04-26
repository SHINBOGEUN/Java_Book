package ch24;
// 자체적으로 추상메서드 1개 포함. 자체적 객체생성 x 하위객체연결시 재정의한 함수접근 가능; 
abstract class Moonbanggu{
	protected static int sharpenCnt = 100; // 상속관계 접근 가능
	protected static int pencilCnt = 100;
	abstract public void write();
	
	void ShowInfo() {
		System.out.println("샤프의 개수 : " + sharpenCnt);
		System.out.println("연필의 개수 : " + pencilCnt);
	}
	
	
}
class Pencil extends Moonbanggu{
	Pencil() {
		pencilCnt--;
	}
	@Override
	public void write() {
		System.out.println("연필을 씁니다.");
	}
	
}
class Sharpen extends Moonbanggu{


	
	
	@Override
	public void write() {
		System.out.println("샤프를 씁니다.");
	}
	
}


public class MoonMain {
	public static void MoonWrite(Moonbanggu gu) {
		gu.write();
		gu.ShowInfo();
		System.out.println();
	}
	
	
	
	
	 public static void main(String[] args) {
//		Moonbanggu ob = new Moonbanggu(); // 객체 생성 불가
//		Moonbanggu ob1 = new Pencil(); //하위 객체연결 Pencil write 사용가능
//		Moonbanggu ob2 = new Sharpen();//하위 객체연결 Sharpen write 사용가능
//		
//		ob1.write();
//		ob2.write();
		MoonWrite(new Pencil());
		MoonWrite(new Sharpen());
			
	}
}
