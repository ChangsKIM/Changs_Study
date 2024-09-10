package e03_constructor;

public class Employee {
	//사번
	String empNo;
	//사원명
	String empName;
	//직급명
	String positionName;
	//부서명
	String deptName;
	//급여
	int salary;
	
	//모든 필드 초기화하는 생성자
	Employee(String empNo, String empName, String positionName, String deptName, int salary) {
		this.empNo = empNo;
		this.empName = empName;
		this.positionName = positionName;
		this.deptName = deptName;
		this.salary = salary;
	}
	
	//사원정보 출력하는 메서드
	void printEmployeeInfo() {
		System.out.println(empNo + " / " + empName + " / " 
	+ positionName + " / " + deptName + " / " + salary);
	}
	//EmployeeMain클래스 작성해서 작성한 Employee 클래스 생성해서 테스트
}
