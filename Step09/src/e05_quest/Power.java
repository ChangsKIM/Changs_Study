package e05_quest;
/*
 * 전원 관리하는 클래스
 * 		전원 값 
 * 		전원을 켜고끄고하는 메서드
 * 		전원을 켜는 메서드, 전원을 끄는 메서드
 */
public class Power {
	protected boolean power;

	public void powerOn() {
		power = true;
	}
	
	public void powerOff() {
		power = false;
	}
	
	public void powerOnOff() {
		power = !power;
	}
}









