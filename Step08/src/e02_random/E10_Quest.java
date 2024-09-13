package e02_random;
import java.util.Random;

public class E10_Quest {
	public static boolean isPrimeNumber(int n) {
		if(n < 2) return false;
		for(int i=2;i<=n/2;i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(500);

		System.out.print(num + " ");
		if(isPrimeNumber(num))
			System.out.println("숫자는 소수 입니다.");
		else
			System.out.println("숫자는 소수 아닙니다.");
			

	}

}





