package ch06;

public class C03Switch {
	public static void main(String[] args) {
		
		int rank = 5;
		String medalColor;
		
		switch (rank){
		case 1:
			medalColor = "금메달";
			break;
		case 2:
			medalColor = "은메달";
			break;
		case 3:
			medalColor = "동메달";
			break;
		default:
			medalColor = "ㅜㅜ";
		}
		System.out.println("메달 : " + medalColor);
	}
}
