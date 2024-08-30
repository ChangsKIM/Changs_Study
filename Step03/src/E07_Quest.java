import java.util.Scanner;

public class E07_Quest {
	/*
	  	사용자로부터 점수를 입력받아, 
	  	다음의 기준으로 등급을 분류하여 출력하는 프로그램을 작성하세요.
		
		95 이상: A+
		90 ~ 94: A
		85 ~ 89: B+
		80 ~ 84: B
		75 ~ 79: C+
		70 ~ 74: C
		65 ~ 69: D+
		60 ~ 64: D
		0  ~ 59: F
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 > ");
		int score = sc.nextInt();

		String grade = "F";
		
		if(score >= 90) 
			grade = score % 10 >= 5 ? "A+" : "A";
		else if(score >= 80)
			grade = score % 10 >= 5 ? "B+" : "B";
		else if(score >= 70)
			grade = score % 10 >= 5 ? "C+" : "C";
		else if(score >= 60)
			grade = score % 10 >= 5 ? "D+" : "D";
						
		System.out.println(grade);
		
		/*
		 	if(score >= 90)
				grade =	"A";
			else if(score >= 80)
				grade =	"B";
			else if(score >= 70)
				grade =	"C";
			else if(score >= 60)
				grade =	"D";
			
			if(score >= 70 && score % 10 >= 5 || score == 100)
				grade += "+";
		*/
	}

}





