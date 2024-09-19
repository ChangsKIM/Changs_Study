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
	
	//학생정보를 학번으로 검색
	private Student searchStudent(String studentNo) {
		//매개변수로 받은 학번과 동일한 학번이 있으면 해당 객체를 student에 저장
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i).getStudentNo().equals(studentNo))
//				return list.get(i);
//		}
		for(Student std : list) {
			if(std.getStudentNo().equals(studentNo)) {
				return std;//검색 결과가 있을때 해당 객체 리턴
			}
		}		
		return null;//검색 결과 없을때
	}
	
	public void insertStudent() {
		//학생정보 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 추가를 진행합니다........");
		//1. 학번, 이름, 학과명, 점수를 입력
		String studentNo = "";
		while(true) {
			System.out.print("등록할 학번 입력 : ");
			studentNo = sc.nextLine();
			//학번 중복 체크
			if(searchStudent(studentNo) != null) {
				System.out.println("학번이 중복되었습니다. 다시 입력해 주세요");
				continue;
			}
			break;			
		}
		System.out.print("등록할 학생이름 입력 : ");
		String studentName = sc.nextLine();
		System.out.print("등록할 학과명 입력 : ");
		String majorName = sc.nextLine();
		System.out.print("등록할 학생 평점 입력 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		
		
		//리스트에 학생정보 추가
		list.add(new Student(studentNo, studentName, majorName, score));
		
	}

	public void searchStudent() {
		Scanner sc = new Scanner(System.in);
		String studentNo;
		//학번 입력 받음
		System.out.println("학생 정보 검색을 시작합니다.....");
		System.out.print("검색할 학번 입력 : ");
		studentNo = sc.nextLine(); 
		
		Student std = searchStudent(studentNo);
		
		if(std == null)
			System.out.println("해당 학생 정보가 없습니다.");
		else
			System.out.println(std);
	}

	public void deleteStudent() {
		// TODO Auto-generated method stub
		
	}

	public void updateStudent() {
		// TODO Auto-generated method stub
		
	}

	public void printAllStudent() {
		//전체 학생 정보 출력
		for(Student std : list) {
			System.out.println(std);
		}
		
	}

	public void searchStudentName() {
		// TODO Auto-generated method stub
		
	}

	
	
}
