package e02_collection;

import java.util.TreeSet;

public class SetObjectExample {

	public static void main(String[] args) {
		//HashSet<Point> set = new HashSet<Point>();
		TreeSet<Point> set = new TreeSet<Point>();

		//set에 Point 데이터 5건 저장, 그중에 한건은 동일한 객체 저장
		set.add(new Point(10, 4));
		set.add(new Point(3, 54));
		set.add(new Point(10, 7));
		set.add(new Point(21, 267));
		set.add(new Point(10, 7));
		set.add(new Point(4, 6));
		
		//set에 내용을 출력
		System.out.println(set);
	}

}





