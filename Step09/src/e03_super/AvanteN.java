package e03_super;

public class AvanteN extends Avante {
	private boolean driveMode;//false - 일반, true - 고속주행
	
	public void changeMode() {
		driveMode = !driveMode;
		//고속 주행 모드로 전환 합니다.
		if(driveMode)
			System.out.println("고속 주행 모드로 전환 합니다.");
		else
			//일반 주행 모드로 전환 합니다.
			System.out.println("일반 주행 모드로 전환 합니다.");
	}
	
	@Override
	public void accerate() {
		//고속 주행 모드면 속도증가 15, 연료량 3씩 소모
		
		//일반은 부모에서 쓰던 기능 그대로
		
	}
	

}
