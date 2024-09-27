package service;

import java.util.ArrayList;
import java.util.Scanner;

import dto.Student;

public class StudentService {
	private static StudentService instance;
	private ArrayList<Student> list;
	
	private StudentService() {
		list = new ArrayList<Student>();
		//샘플데이터 3~4건
		list.add(new Student("S001", "홍길동", "컴퓨터공학과", 3.5));
		list.add(new Student("S002", "김철수", "전자공학과", 3.8));
		list.add(new Student("S003", "이영희", "수학과", 4.0));
	}

	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}
	
	public ArrayList<Student> getList() {
		return list;
	}
	
	public boolean insertStudent(Student student) {
		//리스트에 학생정보 추가
		return list.add(student);
	}

	//검색할 학번을 인자값으로 받음
	public Student searchStudent(String studentNo) {
		
		int idx = list.indexOf(new Student(studentNo, null, null, 0));
		
		if(idx == -1)
			return null;
		else
			return list.get(idx);//검색 결과 인덱스 번호로 데이터 뽑아서 전달
	}

	public boolean deleteStudent(String studentNo) {	
		return list.remove(new Student(studentNo, null, null, 0));
	}

	public void searchStudentName() {
		System.out.println("학생 이름 일부로 검색을 시작합니다.");
		Scanner sc = new Scanner(System.in);
		//학생 이름 일부 입력
		System.out.print("학생 이름 일부 : ");
		String name = sc.nextLine();
		
		int count = 0;
		//반복문
		for(int i=0;i<list.size();i++) {
		//	입력한 검색어가 학생 이름에 있는지 확인 후 출력
			if(list.get(i).getStudentName().indexOf(name) != -1) {
				System.out.println(list.get(i));
				count++;
			}
		}
		
		//검색 결과가 없으면, '해당 검색결과가 없습니다.' 메세지 출력
		if(count == 0) System.out.println("해당 검색 결과가 없습니다.");
		else System.out.println(count +"건이 검색 되었습니다.");
	}

	
	
}
