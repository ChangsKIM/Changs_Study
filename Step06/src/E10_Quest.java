import java.util.Scanner;

public class E10_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int i;
		
		for (i = 2; i < num; i++) {
			if(num % i == 0)
				break;
		}
		
		if(i == num)
			System.out.println("입력하신 숫자는 소수 입니다.");
		else
			System.out.println("입력하신 숫자는 소수 아닙니다.");
			

	}

}





