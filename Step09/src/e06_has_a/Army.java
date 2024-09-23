package e06_has_a;
/*
 * 	군인 클래스에서는 총 정보를 모두 가지고 있어야함
 * 	군인이 총쏘는 행위를 하면 총에 있는 shot을 실행
 *  군인이 재장전 하는 행위를 하면 총에 있는 reload를 실행 
 * 
 */
public class Army extends Gun{
	
	//군인이 총쏘는 행위
	@Override
	public void shot() {
		super.shot();
	}

	//군인이 재장전하는 행위
	@Override
	public void reload() {
		super.reload();
	}
}





