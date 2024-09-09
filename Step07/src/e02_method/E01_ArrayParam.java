package e02_method;

public class E01_ArrayParam {

	//배열의 내용을 출력하는 메서드
	static void printArray(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]+" ");
		}
		System.out.println();
//		System.out.println(ary);
	}
	//배열의 내용을 1씩 증가시키는 메서드
	static void addArray(int[] ary) {
		for(int i=0;i<ary.length;i++) {
			ary[i]++;
		}
//		System.out.println(ary);
	}
	
	public static void main(String[] args) {
		//정수형 배열 길이가 5인 배열 생성, 임의의 값으로 초기화
		int[] arr = {1,2,3,4,5};
//		System.out.println(arr);
		addArray(arr);
		printArray(arr);
		printArray(new int[] {1,2,3,4,5,6,7,8,9});
		printArray(new int[] {1,2,3,4,5,6,7,8,9});
		
	}

}
