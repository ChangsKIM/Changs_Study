package e02_collection;

import java.util.ArrayList;
import java.util.Random;

public class ListObjectExample {

	public static void main(String[] args) {
//		ArrayList<Point> list = new ArrayList<Point>();
		ArrayList<Point> list = new ArrayList<>();
		
		//리스트에 데이터 10건
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			list.add(new Point(r.nextInt(20), r.nextInt(20)));
		}
		list.add(new Point(10, 7));
		
		for(Point p : list)
			System.out.println(p);
		
//		Point search = new Point(5, 4);
		Point search = new Point(10, 7);
		System.out.println(list.contains(search)); 
		System.out.println(list.indexOf(search)); 
		System.out.println(list.remove(search));
		System.out.println(list);
	}

}




