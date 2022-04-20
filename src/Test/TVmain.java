package Test;

class TV{
	String name;
	int year;
	int size;
	
	public TV(String _name, int _year, int _size) {
		this.name = _name;
		this.year = _year;
		this.size = _size;
	}
	
	
	void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV",name,year,size);
	}
	
}


public class TVmain {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32); 
		myTV.show();
	}

}
