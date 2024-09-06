package e01_class;

import javax.swing.event.ListDataEvent;

public class Student {
	//클래스 안에 선언된 변수는 해당 객체가 일을 할떄 사용되는 변수인데
	//이것을 field(필드) 라고함
	//학번 
	String studentNo;
	//이름
	String studentName;
	//학과명
	String majorName;
	//평점
	double score;
	
	//메서드 
	void printStudentInfo() {
		System.out.println(studentNo + " " + studentName + " " +
					majorName + " " + score);
	}
}






