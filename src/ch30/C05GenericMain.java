package ch30;


class Meterial{

	@Override
	public String toString() {
		return "그냥재료";
	}
	
	
}


class onion extends Meterial{
	public String toString() {
		return "어니언";
	}
}

class caramel extends Meterial{           
	public String toString() {
		return "카라멜";
	}
}
class Mincho extends Meterial{

	@Override
	public String toString() {
		return "민트초코";
	}
	
}


class Popcorn<T extends Meterial> { //제한할 재료 범위를 지정 (extends 상위클래스형)
	private T meterial;

	public T getMeterial() {
		return meterial;
	}
	
	public void setMeterial(T meterial) {
		this.meterial = meterial;
	}
	
	public void Fry() {
		System.out.println(meterial +  "팝콘을 만듭니다.");
	}	
}




public class C05GenericMain {
	public static void main(String[] args) {
		//정상재료
		Popcorn<caramel> ob1 = new Popcorn<caramel>();
		ob1.setMeterial(new caramel());
		ob1.Fry();
		
		Popcorn<onion> ob2 = new Popcorn<onion>();
		ob2.setMeterial(new onion());
		ob2.Fry();
		
		//비정상 재료
		Popcorn<Mincho> ob3 = new Popcorn<Mincho>(); // 잘못된 재료라서 오류;
		ob3.setMeterial(new Mincho());
		ob3.Fry();
		
		
	}
}
