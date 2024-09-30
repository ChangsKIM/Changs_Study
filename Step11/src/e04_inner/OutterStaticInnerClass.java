package e04_inner;

public class OutterStaticInnerClass {
	private int outter;
	private static int n = 100;
	
	public OutterStaticInnerClass(int outter) {
		this.outter = outter;
	}
	
	public static class InnerStaticClass{
		private int inner;

		public InnerStaticClass(int inner) {
			this.inner = inner;
		}
		
		
	}
	
	
}
