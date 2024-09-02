import java.util.Scanner;

public class E14_Quest {
	/*
	  	사용자로부터 점수를 입력받아, 
	 	다음의 기준으로 등급을 분류하여 출력하는 프로그램을 작성하세요.

		90점 이상: A
		80점 이상 ~ 90점 미만: B
		70점 이상 ~ 80점 미만: C
		60점 이상 ~ 70점 미만: D
		60점 미만: F
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 > ");
		int score = sc.nextInt();

		if(score >= 90)
			System.out.println("A");
		else if(score >= 80)
			System.out.println("B");
		else if(score >= 70)
			System.out.println("C");
		else if(score >= 60)
			System.out.println("D");
		else
			System.out.println("F");
		
		//-------------------------------
		switch(score / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		
	}

}





