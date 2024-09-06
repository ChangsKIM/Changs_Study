import java.util.Arrays;

public class E23_Quest {
	public static void main(String[] args) {
		//길이가 20인 정수형 배열을 생성
		//값을 1~20까지 저장
		int[] arr = new int[20];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			int idx = (int)(Math.random() * arr.length);
			
			if(i == idx) {
				i--;
				continue;
			}
			
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}





