
public class E03_LoopInLoop {

	public static void main(String[] args) {
		for(int dan = 2; dan < 10; dan++) {
			System.out.println("---"+ dan + "단 ---");
			for(int i = 1;i < 10;i++) {
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			}
		}
		System.out.println("------------");
		//위에 코드를 while로 바꾸어서 실행
		//중첩된 반복문 전후로 해야될 작업 명확히 처리해야되는 부분
		int dan = 2;
		int i = 1;
		while( dan < 10 ) {
			System.out.println("---"+ dan + "단 ---");
			i = 1;
			while(i < 10) {
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
				i++;
			}
			dan++;
		}
	}

}





