package e01_class;

public class Employee {
	//필드
	//사번 - String
	String employeeNo;
	//이름 - String
	String employeeName;
	//성별 - boolean
	boolean employeeGender;
	//직급 - String
	String positionName;
	//부서 - String 
	String departmentName;
	//연봉 - int
	int employeeSalary;

	//메서드
	//사원정보 출력
	void printEmployeeInfo() {
		String gender = employeeGender ? "남" : "여";
		//사번 이름(성별) 직급 부서 연봉
		System.out.printf("%s %s(%s) %s %s %d\n",
				employeeNo, employeeName, gender, positionName,
				departmentName, employeeSalary);
	}
	//사원정보 초기화
	void init(String no, String name, boolean gender, 
			String position, String department, int salary) {
		employeeNo = no;
		employeeName = name;
		employeeGender = gender;
		positionName = position;
		departmentName = department;
		employeeSalary = salary;
	}
}





