package ch19;


class Client{
	String name;
	String phone;
	Client(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
}

class Restaurant{
	String StoreName;
	int roomcnt;			 	//지점 room개수
	static int totalRoomcnt;	//전체 room개수
	Client list[];				//예약 손님 정보 저장용 배열 참조변수
	int idx;					//list배열에 저장될 객체 위치idx >>> 번호
	// 생성자
	public Restaurant(String storeName, int roomcnt) {
		StoreName = storeName;			//지점명 저장
		this.roomcnt = roomcnt;			//방개수 저장
		totalRoomcnt += roomcnt;		//전체 방개수 누적
		list = new Client[roomcnt];		//예약손님정보 저장용 배열
		idx = 0;
	}
	
	
	void setReserve(Client client) {
		if (roomcnt != 0) {
			roomcnt--;
			totalRoomcnt--;
			list[idx] = client;
			idx++;
			
			
		}else {//잔여 room수 부족
			System.out.println("예약이 꽈악!!!!! 차서 예약이 불가능합니다.");
		}
	}
	
	void ShowClientInfo() {
		System.out.println("==========================================");
		System.out.println("지점명 : " + StoreName);
		for (int i = 0; i <idx; i++) {
			System.out.printf("%d , %s , %s\n",i+1,list[i].name,list[i].phone);
		}
		System.out.println("==========================================");
	}
	
	
	
	void ShowInfo() {
		System.out.println("==========================================");
		System.out.println("지점명 : " + StoreName);
		System.out.println("지점 잔여 room : " + roomcnt);
		System.out.println("전체 잔여 room : " + totalRoomcnt);
		System.out.println("==========================================");
	}
}
public class C04StaticMain {
	public static void main(String[] args) {
		Restaurant 서가앤쿡반월당점 = new Restaurant("반월당점", 10);
		서가앤쿡반월당점.setReserve(new Client("홍길동1", "0101010101010"));
		서가앤쿡반월당점.setReserve(new Client("홍길동2", "0101010101010"));
		서가앤쿡반월당점.setReserve(new Client("홍길동3", "0101010101010"));
		Restaurant 서가앤쿡감삼점 = new Restaurant("감삼점", 5);
		서가앤쿡감삼점.setReserve(new Client("남길동1", "1010101"));
		서가앤쿡감삼점.setReserve(new Client("남길동2", "1010101"));
		서가앤쿡감삼점.setReserve(new Client("남길동3", "1010101"));
		
		
		
		
		서가앤쿡반월당점.ShowInfo();
		서가앤쿡반월당점.ShowClientInfo();
		서가앤쿡감삼점.ShowInfo();
		서가앤쿡감삼점.ShowClientInfo();
		
		
		
	}
}















