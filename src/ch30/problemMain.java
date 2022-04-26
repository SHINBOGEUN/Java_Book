//package ch30;
//
//class Plastic{
//
//	public void doPrinting() {
//		System.out.println("Powder 재료로 출력");
//	}
//}
//
//class Powder{
//
//	
//	public void doPrinting() {
//		System.out.println("Plastic 재료로 출력");
//	}
//	
//}
//
//class ThreeDpriter<T>{
//	
//	//속성 meterial : Generic <T>
//	
//	private T merterial;
//	
//
//	public T getMerterial() {
//		return merterial;
//	}
//
//	public void setMerterial(T merterial) {
//		this.merterial = merterial;
//	}
//	
//
//	
//	
//	
//	
//}
//
//
//
//public class problemMain {
//	public static void main(String[] args) {
//		ThreeDpriter<Powder> print1 = new ThreeDpriter<Powder>(); // 3d프린터의 재너릭 타입을 Powder로 지정
//																// 3d프린터<Powder> 객체 생
//		print1.setMerterial(new Powder());						
//		print1.getMerterial().doPrinting();						// Powder객체 생성 후 주소르 3d프린트객체로 전달
//		
//		ThreeDpriter<Plastic> print2 = new ThreeDpriter<Plastic>();
//		print2.setMerterial(new Plastic());
//		print2.getMerterial().doPrinting();
//		
//	}
//}
