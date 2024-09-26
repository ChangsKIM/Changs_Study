package controller;

public class HandlerMapping {
	private static HandlerMapping instance;

	private HandlerMapping() {	}

	public static HandlerMapping getInstance() {
		if(instance == null)
			instance = new HandlerMapping();
		return instance;
	}

	//작업자를 생성해서 리턴하는 메서드
	public Controller createController(int no) {
		Controller controller = null;
		
		return controller;
	}
	
}





