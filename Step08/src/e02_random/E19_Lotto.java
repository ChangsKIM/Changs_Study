package e02_random;
import java.util.Arrays;
import java.util.Random;

public class E19_Lotto {

	public static void main(String[] args) {
		//랜덤 클래스 생성
		Random r = new Random();
		
		for(int c=0;c<5;c++) {
			//로또번호 1셋트 랜덤으로 생성해서 출력, 1 ~ 45
			int[] arr = new int[6];

			//랜덤으로 배열에 숫자를 저장, 저장할 범위 : 1~10
			for(int i=0;i<arr.length;i++) {
				arr[i] = r.nextInt(45) + 1;
				for(int j = 0; j < i ; j++) {
					if(arr[i] == arr[j]) {
						i--;
						break;
					}
						
				}
			}
			//출력
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
