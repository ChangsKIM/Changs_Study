package e02_method;

public class E02_SortArray {
	static void printArray(int pass, int[] arr) {
		System.out.print(pass + "pass : ");
		for(int n : arr)
			System.out.printf("%d ", n);
		System.out.println();
	}
	static void buble(int[] arr) {
		//버블 정렬
		// 정렬을 (배열 길이 - 1) 번 만큼 수행
		for(int i=0;i<arr.length-1;i++) {
			// 앞뒤로 비교하면서 정렬을 수행
			for(int j=0;j<arr.length-1-i;j++) {
			// 오름차순이기 때문에 앞뒤로 값을 비교했을 떄 큰 값을 뒤로 보낸다.
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			// 정렬 한번씩 수행했을때 배열의 내용을 출력해서 정렬 과정도 체크
			printArray(i+1, arr);
		}
		
	}
	static void select(int[] arr) {
		//선택 정렬
		//	정렬을 (배열 길이 - 1) 번 만큼 수행
		//	기준 인덱스 0 ~ 배열길이 - 1
		for(int i=0;i<arr.length-1;i++) {
			//비교할 인덱스 번호
			//  제일 작은 값이 있는 인덱스 저장할 변수 선언 초기화는 기준 인덱스
			int idx = i;
			for(int j=i+1;j<arr.length;j++) {
				//	제일 작은 값이 있는 인덱스 번호를 저장
				if(arr[idx] > arr[j]){
					idx = j;
				}
			}
			//  제일 작은 값이 있는 인덱스와 기준 인덱스 값과 교환
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
			
			//	배열 내용을 출력
			printArray(i+1, arr);
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] arr1 = {8, 4, 6, 9, 7, 1};
		int[] arr2 = {23,45,2,5,6,2,65,233,2};
		int[] arr3 = {8, 4, 6, 9, 7, 1};
		int[] arr4 = {23,45,2,5,6,2,65,233,2};
		buble(arr1);
		System.out.println("--------------------");
		buble(arr2);
		System.out.println("--------------------");
		select(arr3);
		System.out.println("--------------------");
		select(arr4);
		
	}

}




