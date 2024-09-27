package e02_generic_extends;

public class MouseMain {

	public static void main(String[] args) {
		GamingMouse gamingMouse = new GamingMouse();
		OfficeMouse officeMouse = new OfficeMouse();
		
		MouseHUB<GamingMouse> hub = 
				new MouseHUB<GamingMouse>(gamingMouse);
		hub.click(1);
		hub.click(2);
		hub.wheel();
		//Office 마우스는 Mouse를 상속 받지않아서 제네릭 지정하는 타입으로 못씀
//		MouseHUB<OfficeMouse> hub2 = new MouseHUB<OfficeMouse>(officeMouse);
		
	}

}