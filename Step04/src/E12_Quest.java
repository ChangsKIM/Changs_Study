import java.util.Scanner;

public class E12_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. 숫자 입력, 팩토리얼 저장할 변수, 1~입력한 숫자까지 제어할 변수
		int n = 0, fac = 1;
		System.out.print("팩토리얼 구할 숫자 입력 : ");
		n = sc.nextInt();

		// 2. 1~입력한 숫자까지 반복
		for (int i = 1;i <= n;i++) {
			// 3. 반복할 일 : 팩토리얼에 1~입력한 숫자를 1개씩 곱해서 저장
			fac *= i;
		}
		// 4. 결과 출력
		System.out.println(fac);
	}

}
