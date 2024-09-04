import java.util.Scanner;

public class E06_Quest {
	/*
	 * 	정수형 배열 길이가 10인 배열을 생성한 후에
	 *  정수를 입력 받아서 배열의 각 요소에 전부 저장한 후에
	 *  배열에 저장된 값의 총합을 출력
	 */
	public static void main(String[] args) {
		//1. 배열 선언, 총합 저장할 변수
		int[] arr = new int[10];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		//2. 배열에 숫자 입력
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 > ");
			arr[i] = sc.nextInt();
		}		
		//3. 총합
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		//4. 결과 출력
		System.out.println("총합 : " + sum);
	}

}




