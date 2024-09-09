package e01_class;

public class EmployeeMain {

	public static void main(String[] args) {
		//new -> 메모리 할당, 생성된 Employee 객체(instance)
		Employee emp = new Employee();
		emp.init("20101111", "김철수", false, "부장", "총무부", 7800);
		emp.printEmployeeInfo();
		System.out.println(emp.updateSalary(9000));
		System.out.println(emp.updateSalary(2300));
	}

}
