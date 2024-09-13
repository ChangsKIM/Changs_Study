package e02_random;
import java.util.Random;

public class E19_Lotto {
	//1~45 숫자 리턴하는 메서드
	public static int generateLottoNumber() {
		Random r = new Random();
		return r.nextInt(45) + 1;
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
		//랜덤 클래스 생성
		Random r = new Random();
		
		for(int c=0;c<5;c++) {
			//로또번호 1셋트 랜덤으로 생성해서 출력, 1 ~ 45
			int[] arr = new int[6];

			//랜덤으로 배열에 숫자를 저장, 저장할 범위 : 1~10
			for(int i=0;i<arr.length;i++) {
				int n = generateLottoNumber();
				if(isDuplicateNumber(arr, n)) {
					i--;
					continue;
				}
				arr[i] = n;
			}
			//출력
			printLottoNumber(arr);
		}
		
	}

}
