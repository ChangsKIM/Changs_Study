package e01_object;

public class CircleMain {

	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(10, 7), 5);
		Circle c2 = c1.clone();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(c2));
		c1.setR(10);
		System.out.println(c1);
		System.out.println(c2);
		c1.getPos().setX(50);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("----------------");
		
		
	}

}



