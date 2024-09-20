package e03_super;

public class AvanteNMain {

	public static void main(String[] args) {
		AvanteN avanteN = new AvanteN();
		
		for(int i=0;i<20;i++)
			avanteN.accerate();
		
		avanteN.changeMode();
		
		for(int i=0;i<20;i++)
			avanteN.accerate();
	}

}
