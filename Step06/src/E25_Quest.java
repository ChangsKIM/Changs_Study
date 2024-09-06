import java.util.Scanner;

public class E25_Quest {

	public static void main(String[] args) {
		//정수형 배열 생성, 길이 10
		//Scanner 생성
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		//반복문 - 무한루프
		while(true) {
			System.out.println("1 - 숫자 추가");
			System.out.println("2 - 숫자 삭제");
			System.out.println("3 - 전체 숫자 출력");
			System.out.println("0 - 프로그램 종료");
			System.out.print("원하시는 번호를 입력 하세요 : ");
			int no = sc.nextInt();
			
			if(no == 0) {
				break;
			}
		}
	}

}







