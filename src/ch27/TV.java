package ch27;

class C01TV{
	private int size;
	
	public C01TV(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}

class ColorTV extends C01TV{
	private int color;
	
	
	
	public int getColor() {
		return color;
	}

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	void printProperty() {
		System.out.printf("%d인치 %d컬러\n", this.getSize(),color);
	}
}

class IPTV extends ColorTV{
	
	String IP;

	public IPTV(String iP,int size, int color) {
		super(size, color);
		IP = iP;
	}
	
	@Override
	void printProperty() {
		System.out.printf("나의 IPTV %s주소의 %d인치 %d컬러\n",IP, this.getSize(), getColor());
	}
	
	
}
public class TV {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
		
		IPTV ip = new IPTV("192.1.1.2",32, 2048 );
		ip.printProperty();
		
		
	}
}
