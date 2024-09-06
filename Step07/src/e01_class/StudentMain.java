package e01_class;

public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student();//학생 데이터 저장할 인스턴스 생성
		//데이터 초기화
		std1.studentNo = "20111234";
		std1.studentName = "김철수";
		std1.majorName = "컴퓨터공학과";
		std1.score = 3.14;
		
		std1.printStudentInfo();
		
		Student std2 = new Student();
		std2.studentNo = "20111111";
		std2.studentName = "김영희";
		std2.majorName = "경영학과";
		std2.score = 4.2;
		
		std2.printStudentInfo();
		
	}

}







