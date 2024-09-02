import java.util.Iterator;
import java.util.Scanner;

public class E13_Quest {
	/*
	 * 	숫자 하나 입력 받아서
	 * 	입력한 숫자의 모든 약수를 출력
	 * 	(for문으로 작업)
	 * 	실행 예>
	 * 		숫자 입력 > 6
	 * 		1 2 3 6
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if(n % i == 0)
				System.out.print(i + " ");
		}
	}

}






