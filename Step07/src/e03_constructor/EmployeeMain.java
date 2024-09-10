package e03_constructor;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee("1111", "김씨", "부장", "총무부", 7800);
		Employee e2 = new Employee("2222", "이씨", "차장", "총무부", 3800);
		Employee e3 = new Employee("3333", "박씨", "과장", "총무부", 6800);
		
		e1.printEmployeeInfo();
		e2.printEmployeeInfo();
		e3.printEmployeeInfo();
	}

}
