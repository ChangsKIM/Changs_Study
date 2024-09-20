package e02_method;

public class E05_RecursiveMethod {

	//매개변수로 숫자 하나 받아서 해당 숫자의 팩토리얼 값을 리턴하는 메서드
	//return 5 * {return 4 * {return 3 * {return 2 * fac(1)}}}
	public static int fac(int n) {
		if(n == 1)
			return 1;
		return n * fac(n-1);		
	}
	
	public static void main(String[] args) {
		System.out.println(fac(5));

	}

}
