package Test;


class Song{
	String title;
	String artist;
	int year;
	String country;
	
	
	public Song() {
		title = "";
		artist = "";
		year = 0;
		country ="";
	}
	public Song(String _title, String _artist, int _year, String _country) {
		this.title = _title; 
		this.artist = _artist; 
		this.year = _year;
		this.country = _country;
	}
	void show() {
		System.out.printf("%d년 %s국적의 %s가 부른 %s", year,country,artist,title);
	}
	
	
	
	
	
	
}


public class Songmain {
	public static void main(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA" , 1978, "스웨덴");
		s.show();
	}
}
