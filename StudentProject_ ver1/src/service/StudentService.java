package service;

import java.util.Scanner;

import dto.Student;

/*
 * 	학생 데이터를 배열로 관리
 * 	작업 배열에 학생 데이터 추가, 삭제, 검색, 수정
 * 
 */
public class StudentService {
	//학생정보 저장할 배열
	private Student[] arr;
	//배열을 관리할 인덱스
	private int idx;
	
	public StudentService() {
		arr = new Student[5];
	}
	
	//추가
	//		학번, 이름, 학과명, 점수를 입력받아서
	//		배열에 추가
	public void insertStudent() {
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
		//2. Student 객체 생성
		//Student student = new Student(studentNo, studentName, majorName, score);
		//3. 배열에 등록
		//arr[idx] = student;
		//4. idx 증가
		//idx++;
		arr[idx++] = 
				new Student(studentNo, studentName, majorName, score);
		
	}//insertStudent
	
	//삭제
	
	//검색
	
	//수정
	
	//전체 출력
	public void printAllStudent() {
		//idx 전까지 모든 학생정보를 출력
		System.out.println("전체 학생정보를 출력합니다.....");
		for(int i=0;i<idx;i++)
			System.out.println(arr[i].toString());
		
	}
	
	
}








