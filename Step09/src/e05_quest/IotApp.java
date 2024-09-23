package e05_quest;

import java.util.ArrayList;

public class IotApp {
	private ArrayList<Power> list;

	public IotApp() {
		list = new ArrayList<Power>();
		list.add(new TV());
		list.add(new Aircon());
		list.add(new Light());
		list.add(new Light());
	}
	
	//전체 전원 On
	
	//전체 전원 Off
	
}
