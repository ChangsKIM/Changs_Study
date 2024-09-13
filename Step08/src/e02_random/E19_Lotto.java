package e02_random;
import java.util.Random;

public class E19_Lotto {
	//로또번호 한셋트 리턴하는 메서드
	public static int[] generateLotto() {
		int[] arr = new int[6];
		Random r = new Random();
		//랜덤으로 배열에 숫자를 저장, 저장할 범위 : 1~10
		for(int i=0;i<arr.length;i++) {
			int n = r.nextInt(45) + 1;
			if(isDuplicateNumber(arr, n)) {
				i--;
				continue;
			}
			arr[i] = n;
		}
		return arr;
	}
	
	//로또번호 한셋트 출력하는 메서드
	//숫자를 두자리씩 출력
	public static void printLottoNumber(int[] arr) {
		for(int n : arr){
			System.out.print(String.format("%02d ", n));
		}
		System.out.println();
	}
	
	//중복 체크하는 메서드
	public static boolean isDuplicateNumber(int[] arr, int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == n)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		for(int c=0;c<5;c++) {
			printLottoNumber(generateLotto());
		}
		
	}

}
