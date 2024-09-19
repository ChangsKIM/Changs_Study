package service;

import java.util.ArrayList;
import java.util.Scanner;

import dto.Student;

public class StudentService {
	private static StudentService instance;
	private ArrayList<Student> list;
	
	private StudentService() {
		list = new ArrayList<Student>();
	}

	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}

	public void insertStudent() {
		//학생정보 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 추가를 진행합니다........");
		//1. 학번, 이름, 학과명, 점수를 입력
		System.out.print("등록할 학번 입력 : ");
		String studentNo = sc.nextLine();
		System.out.print("등록할 학생이름 입력 : ");
		String studentName = sc.nextLine();
		System.out.print("등록할 학과명 입력 : ");
		String majorName = sc.nextLine();
		System.out.print("등록할 학생 평점 입력 : ");
		double score = sc.nextDouble();
		//리스트에 학생정보 추가
		list.add(new Student(studentNo, studentName, majorName, score));
		
	}

	public void searchStudent() {
		// TODO Auto-generated method stub
		
	}

	public void deleteStudent() {
		// TODO Auto-generated method stub
		
	}

	public void updateStudent() {
		// TODO Auto-generated method stub
		
	}

	public void printAllStudent() {
		// TODO Auto-generated method stub
		
	}

	public void searchStudentName() {
		// TODO Auto-generated method stub
		
	}

	
	
}
