package e02_overrding;

public class Huskey extends Dog {

	@Override
	public void eat() {
		System.out.println("허스키가 소고기를 먹습니다.");
		run();
	}
	
	public void run() {
		System.out.println("허스키가 달립니다.");
	}
	
}



