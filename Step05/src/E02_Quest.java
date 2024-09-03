import java.util.Scanner;

public class E02_Quest {
	/*
	 * 숫자를 0입력 할때까지 숫자 입력을 받는 반복문
	 * 반복문이 끝나면 입력받은 숫자들의 합을 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1, sum = 0, count = 0;
		while(n != 0) {
			System.out.print("숫자 입력(0입력시 종료) >");
			n = sc.nextInt();
			sum += n;
			count++;
		}
		System.out.println((double)sum / --count);
		
	}

}
