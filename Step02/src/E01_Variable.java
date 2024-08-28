
public class E01_Variable {

	public static void main(String[] args) {
		/*
		 * 	데이터 형태
		 * 		정수 : 양수, 음수, 0
		 * 		실수 : 정수에서 소수점이 추가된 형태
		 * 		문자 : 한 글자
		 * 		논리 : 참(true), 거짓(false)
		 * 		문자열 : 문자가 한개이상 구성된 형태
		 * 
		 * 	변수(Variable) : 데이터를 하나 저장할 공간
		 * 
		 * 	변수 선언 방법
		 * 		변수타입 변수명; 
		 */
		
		//변수 선언 방법 - 1
		int num;//num이라는 이름으로 정수형 데이터를 하나 저장할 공간을 임대 받았다
		num = 100;//정수 100을 변수 num에 저장하겠다.
		System.out.println(num);//num이 저장하고 있는 100을 읽어와서 화면에 출력
		num = 200;
		System.out.println(num);
		
		//변수 선언 방법 - 2
		//초기화(initialize) : 변수를 선언한 뒤에 처음 저장해는 행위
		int a = 10;
		System.out.println(a);
		
		//동일한 변수타입의 변수를 만드는 경우
		int n1 = 10, n2 = 20;
		System.out.println(n1 + " " + n2);
	}

}







