import java.util.Arrays;
import java.util.Scanner;

public class E11_Quest {
	/*
	 * 	정수형 배열 길이가 10인 배열을 생성한 뒤에
	 * 	숫자 입력 받아서 배열에 저장
	 *  배열에 있는 숫자를 출력 할때, 홀수 먼저 출력 후
	 *  짝수를 출력
	 *  
	 *  홀수 : 1 3 5 7 9
	 *  짝수 : 2 4 6 8 10
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 > ");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		String odd = "홀수 출력 : ";
		String even = "짝수 출력 : ";
		
		for(int n : arr) {
			if(n % 2 == 1) {
				odd += n + " ";
			} else {
				even += n + " ";
			}
		}
		System.out.println(odd);
		System.out.println(even);
		
	}

}






