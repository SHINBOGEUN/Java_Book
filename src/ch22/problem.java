package ch22;

class Employee{
	public String name;
	public String addr;
	public String phone;
	//생성자
	
	
	public Employee(String name, String addr, String phone) {
		super();
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}

	void ShowBasicInfo() {
		System.out.println("===========================");
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + addr);
		System.out.println("연락처 : " + phone);
	}
}

class Reguler extends Employee{
	private int salary;
	private String title;
	public String depart;
	//생성자
	public Reguler(String name, String addr, String phone,int salary, String title, String depart) {
		super(name,addr,phone);
		this.salary = salary;
		this.title = title;
		this.depart = depart;
	}
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}




	void ShowReginfo() {
		ShowBasicInfo();
		System.out.println("연봉 : " + salary);
		System.out.println("직책 : " + title);
		System.out.println("부서 : " + depart);
	}
}


class Temporary extends Employee{
	private int perPayment;
	private int workingHour;
	private int workingDay;
	//생성자
	public Temporary(String name, String addr, String phone, 
			int perPayment, int workingHour, int workingDay) {
		super(name, addr, phone);
		this.perPayment = perPayment;
		this.workingHour = workingHour;
		this.workingDay = workingDay;
	}
	public int getPerPayment() {
		return perPayment;
	}
	public void setPerPayment(int perPayment) {
		this.perPayment = perPayment;
	}
	public int getWorkingHour() {
		return workingHour;
	}
	public void setWorkingHour(int workingHour) {
		this.workingHour = workingHour;
	}
	public int getWorkingDay() {
		return workingDay;
	}
	public void setWorkingDay(int workingDay) {
		this.workingDay = workingDay;
	}
	void Showinfo() {
		ShowBasicInfo();
		System.out.println("시급 : " + perPayment);
		System.out.println("근무 시간 : " + workingHour);
		System.out.println("근무 일수 : " + workingDay);
	}
	
	
}


public class problem {
	public static void main(String[] args) {
		Reguler emp1 = new Reguler("홍길동", "달서구", "010-33-332", 3000, "사원", "인사부"); 
		Temporary emp2 = new Temporary("이하늘", "중구", "010 333 4444", 20000, 100, 20);
		
		
		
		emp1.ShowReginfo();
		System.out.println();
		emp2.Showinfo();
		
		
	}
}








