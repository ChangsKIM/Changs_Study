package e01_class;

public class TVMain {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.init();
		tv.powerOnOff();
		tv.powerOnOff();
		tv.powerOnOff();
		
		for(int i=0;i<766;i++)
			tv.channelUp();
		for(int i=0;i<30;i++)
			tv.channelDown();
	}

}
