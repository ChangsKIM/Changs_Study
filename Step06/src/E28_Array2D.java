
public class E28_Array2D {
	/*
	 * 정수형 배열 5행 5열 짜리로 생성
	 * 아래처럼 초기화 후
	 * 		1	2	3	4	5
	 * 		6	7	8	9	10
	 * 		11	12	13	14	15
	 * 		16	17	18	19	20
	 * 		21	22	23	24	25
	 * 전체 출력하세요
	 */

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = i * 5 + (j + 1);
				arr[i][j] = num++;
			}
		}
		for(int[] a : arr) {
			for(int n : a)
				System.out.print(n + " ");
			System.out.println();
		}
	}

}








