
public class E04_Quest {

	public static void main(String[] args) {
		//배열 생성
		int[] arr = {2,9,7,8,6,31,543,22,65,44};
		
		//배열에 저장된 값들 중 홀수의 개수를 출력
		//1. 홀수 개수 저장할 변수
		int odd = 0;
		//2. 배열 첫번째 요소부터 마지막까지 접근하면 해당 값이 홀수인지 확인
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 1)
				odd++;
		}
		//3. 홀수 개수 출력
		System.out.println("홀수 개수 : "+odd);
	}

}



