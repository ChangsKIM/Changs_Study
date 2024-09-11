package e02_method;

import e04_access.Square;

public class E04_CallRefVal {
	public static int addNumber(int n) {
		n = n+1;
		return n;
	}
	public static void initSquare(Square s) {
		s.setWidth(10);
		s.setHeight(5);
	}
	public static void main(String[] args) {
		int n = 10;
		addNumber(n);
		System.out.println(n);
		Square s = new Square(40, 20);
		initSquare(s);
		System.out.println(s);
	}

}


