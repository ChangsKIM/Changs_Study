
public class E06_Quest {
	/*
	 * 	1~100까지 숫자들의 합을 출력
	 */
	public static void main(String[] args) {
		//1. 변수 선언
		int i = 1;
		int sum = 0;
		
		//2. 1~100까지 반복
		while(i<=100) {
			//3. 반복할일 작성 : 변수에 더해서 저장(누적)
			sum += i;
			i++;
		}
		//4. 결과 출력
		System.out.println(sum);
	}

}




