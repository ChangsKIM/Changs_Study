package e07_lamda;

public class LamdaEx1 {
	/*
	 * 	람다(Lamda)
	 * 		함수형 프로그래밍 스타일을 지원하는 방법으로 JDK8버전 부터 도입된 기능.
	 * 		익명 함수의 한 형태로 메서드를 간단하게 표현할 수 있음.
	 * 
	 * 		(매개변수) -> 실행할 코드 한줄;
	 * 
	 * 		(매개변수) -> {
	 * 			실행할 코드1;
	 * 			실행할 코드2;
	 * 			실행할 코드3;
	 * 			...
	 * 		}
	 * 
	 * 
	 */
	public static void main(String[] args) {
		//Calcurator 익명클래스로 만들어서 덧셈하는 기능을 작성
		Calcurator sum = new Calcurator() {
			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		};
		System.out.println(sum.calc(10, 20));
		Calcurator calc = (a, b) -> a + b;
		System.out.println(calc.calc(10,30));
		//뺄셈
		Calcurator minus = (x, y) -> x - y;
		System.out.println(minus.calc(10,30));
		//두 숫자중에 큰숫자 리턴
		Calcurator max = (x,y) -> x > y ? x : y;
		System.out.println(max.calc(10,30));
		
		Calcurator total = (x,y) -> {
			//x부터 y까지 합 리턴
			int s = 0;

			for(int i=x;i<=y;i++) s += i;
			
			return s;
		};
		System.out.println(total.calc(1, 100));
		
	}

}





