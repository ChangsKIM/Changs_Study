import java.util.Scanner;

public class E06_Quest {
	/*
	 * 	숫자 입력 > 5
	 * 
	 *      *
	 *     **	
	 *    ***
	 *   ****
	 *  *****
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int line = sc.nextInt();
		for (int i = 0; i < line; i++) {
			//공백 찍는 부분
			for (int j = 0; j < line - i - 1; j++) {
				System.out.print(" ");
			}
			//별 찍는 부분
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------");
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line; j++) {
				if(j < line - i - 1 )
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
