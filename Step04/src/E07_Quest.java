import java.util.Scanner;

public class E07_Quest {
	/*
	 * 	양수 하나를 입력 받아서
	 * 	1부터 입력받은 숫자까지의 합을 출력
	 * 	
	 * 	숫자 : 10
	 * 	1~10까지 합 : 55
	 * 
	 * 	숫자 : 100
	 * 	1~100까지 합 : 5050
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 변수 선언 : 1~입력한 숫자, 입력한 숫자, 총합
		int i=1,n=0,sum=0;
		//2. 숫자 입력
		System.out.print("숫자 입력 : ");
		n = sc.nextInt();
		//3. 반복문 - 1~입력한 숫자
		while(i <= n) {
			//4. 총합에다가 1~입력한 숫자 더해서 저장(누적)
			sum += i;
			i++;
		}
		//5. 반복이 끝나면 결과 출력
		System.out.println(sum);
	}

}





