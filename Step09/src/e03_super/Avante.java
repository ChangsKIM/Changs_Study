package e03_super;

public class Avante {
	//연료량 - 0 ~ 100
	private int fuel;
	//현재 속도 - 0 ~ 240
	private int speed;

	public Avante() {
		fuel = 100;
	}
	//액셀 - 속도를 5씩 증가
	public void accerate() {
		if(fuel < 1) {
			System.out.println("현재 연료가 없습니다 채워주세요");
			return;
		}
		speed += 5;
		if(speed > 240) speed = 240;
		fuel -= 1;
		System.out.println("현재 속도 : "+speed + 
				"km/h - 남은 연료 : " + fuel);
		
	}
	
	//브레이크 - 10
	public void brake() {
		if(speed <= 0 || speed - 10 <= 10) speed = 0;
		else speed -= 10;
		System.out.println("브레이크를 밟았습니다.");
		System.out.println("현재 속도 : "+speed + 
				"km/h - 남은 연료 : " + fuel);
	}
	
}
