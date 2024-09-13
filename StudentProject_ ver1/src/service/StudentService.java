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
		arr[0] = new Student("S001", "홍길동", "컴퓨터공학과", 3.5);
        arr[1] = new Student("S002", "김철수", "전자공학과", 3.8);
        arr[2] = new Student("S003", "이영희", "수학과", 4.0);
        idx = 3;
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
	private int searchStudent(String studentNo) {
		//반복문 이용해서 동일 학번을 찾음
		for(int i=0;i<idx;i++) {
			//찾으면 해당 인덱스 번호 리턴
			if(arr[i].getStudentNo().equals(studentNo))
				return i;
		}
		//검색 결과가 없으면 -1
		return -1;
	}
	public void searchStudent() {
		Scanner sc = new Scanner(System.in);
		String studentNo;
		//학번 입력 받음
		System.out.println("학생 정보 검색을 시작합니다.....");
		System.out.print("검색할 학번 입력 : ");
		studentNo = sc.nextLine(); 
		
		int index = searchStudent(studentNo);
		
		if(index == -1)
			System.out.println("해당 학생 정보가 없습니다.");
		else
			System.out.println(arr[index]);
	}
	//수정
	
	//전체 출력
	public void printAllStudent() {
		//idx 전까지 모든 학생정보를 출력
		System.out.println("전체 학생정보를 출력합니다.....");
		for(int i=0;i<idx;i++)
			System.out.println(arr[i].toString());
		
	}
	
	
}








