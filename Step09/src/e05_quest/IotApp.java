package e05_quest;

import java.util.ArrayList;
import java.util.Iterator;

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
	public void powerAllOnDevice() {
		for(Power p : list) {
			p.powerOn();
		}
		
//		for(int i=0;i<list.size();i++) {
//			list.get(i).powerOn();
//		}
	}
	
	//전체 전원 Off
	public void powerAllOffDevice() {
		for(Power p : list) {
			p.powerOff();
		}
	}
	
}




