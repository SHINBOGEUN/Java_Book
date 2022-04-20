package Test;

class Employee{
	String name;
	String dept;
	String role;
	int salary;
	
	
	public Employee(String _name, String _dept, String _role, int _salary) {
		this.name = _name;
		this.dept = _dept;
		this.role = _role;
		this.salary = _salary;
	}
	void setRole(String _role){
		this.role = _role;
	}
	
	void setDept(String _dept) {
		this.dept = _dept;
	}
	void setSalary(int _salary) {
		this.salary = _salary;
	}
	
	
	
	
	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + dept);
		System.out.println("직책 : " + role);
		System.out.println("급여 : " + salary);
	}
	
}


public class EmployeeMain {
	public static void main(String[] args) {
		 Employee emp1 = new Employee("홍길동","인사부","사원",3000);//name,dept,role,salary
		 emp1.showInfo();
		 
		 System.out.println();
		 emp1.setRole("대리");
		 emp1.setDept("총무부");
		 emp1.setSalary(4000);
		 emp1.showInfo();
	}

}
