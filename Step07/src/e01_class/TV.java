package e01_class;
/*
 * 		데이터
 * 			음량 - int, 채널 - int, 전원 - boolean, 음소거 - boolean
 * 			음량 데이터 범위 : 0 ~ 50
 * 			채널 데이터 범위 : 1 ~ 766
 * 			전원 : true - ON, false - OFF
 * 			음소거 : true - ON, false - OFF
		기능
		    전원OnOff
		    음량Up / 음량 Down
		    채널Up / 채널 Down
		    음소거OnOff
 */
public class TV {
	boolean power;
	boolean mute;
	int channel;
	int volume;
	
	void init() {
		//초기화
		channel = 24;
		volume = 10;
	}
	
	void powerOnOff() {
		//메서드를 실행 할때마다 전원이 켜졌다가 꺼졌다가 해야함
		//전원 값이 true --> TV 전원 On
		//전원 값이 false --> TV 전원 Off
	}

}







