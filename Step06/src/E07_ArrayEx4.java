
public class E07_ArrayEx4 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("---------");
		
		for( int n : arr) {
			System.out.println(n);
		}
	}

}
