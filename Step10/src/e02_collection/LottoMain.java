package e02_collection;

import java.util.TreeSet;

public class LottoMain {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		//---------------------
		//	로또번호 1셋트 생성
		//---------------------
		while(set.size() < 6)
			set.add((int)(Math.random() * 45) + 1);
		
		System.out.println(set);
	}
	

}



