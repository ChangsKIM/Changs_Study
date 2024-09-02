import java.util.Scanner;

public class E08_Quest {
	/*
	 * 		숫자 하나 입력 받아서
	 * 		해당 숫자의 팩토리얼 값을 출력
	 * 
	 * 		예>
	 * 		숫자 입력 > 5
	 * 		120
	 * 
	 * 		팩토리얼 : 한 숫자의 1부터 자기 자신까지의 숫자를 곱한 결과
	 * 		5 -> 1 * 2 * 3 * 4 * 5
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 숫자 입력, 팩토리얼 저장할 변수, 1~입력한 숫자까지 제어할 변수
		int n = 0, fac = 1, i = 1;
		System.out.print("팩토리얼 구할 숫자 입력 : ");
		n = sc.nextInt();
		
		//2. 1~입력한 숫자까지 반복
		while(i <= n) {
			//3. 반복할 일 : 팩토리얼에 1~입력한 숫자를 1개씩 곱해서 저장
			fac *= i;
			i++;
		}
		//4. 결과 출력
		System.out.println(fac);
	}

}









