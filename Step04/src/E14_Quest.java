import java.util.Scanner;

public class E14_Quest {
	/*
	 * 		숫자 하나 입력을 받아서 해당 숫자가 완전수 여부를 출력
	 * 		완전수 : 자기 자신을 제외한 약수들의 합이 자기 자신과 같은 경우
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n/2; i++) {
			if(n % i == 0)
				sum += i;
		}
		
		if(sum == n)
			System.out.println("입력하신 숫자는 완전수 입니다.");
		else
			System.out.println("입력하신 숫자는 완전수가 아닙니다.");
	}

}






