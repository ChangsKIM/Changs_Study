package e03_constructor;

public class Student {
	//학번
	String studentNo;
	//이름
	String studentName;
	//학과명
	String majorName;
	//평점
	double score;
	
	//모든 필드를 초기화하는 생성자
	Student(String studentNo, String name, String major, double s) {
		//this 자기 자신 객체를 나타내는 키워드
		this.studentNo = studentNo;
		studentName = name;
		majorName = major;
		score = s;
	}
	
	
	//학생정보 출력하는 메서드
	void printStudentInfo() {
		System.out.printf("%s %s %s %f\n",studentNo,studentName,
				majorName,score);
	}
}

