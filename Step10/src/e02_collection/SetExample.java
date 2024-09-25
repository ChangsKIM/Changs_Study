package e02_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {
	/*
	 * 		Set
	 * 			1. 데이터를 중복해서 저장하지 않음
	 * 			2. 자동 정렬
	 * 
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		//추가
		System.out.println(set.add("HTML/CSS"));
		System.out.println(set.add("JAVA"));
		System.out.println(set.add("React"));
		System.out.println(set.add("JSP"));
		System.out.println(set.add("js/jQuery"));
		System.out.println(set.add("Oracle"));
		System.out.println(set.add("React"));
		System.out.println(set.add("JSP"));
		System.out.println(set.add("JAVA"));
		System.out.println(set);
		
		//삭제
		set.remove("React");
		System.out.println(set);
		
		//데이터 개수
		System.out.println(set.size());
		
		//데이터 검색
		System.out.println(set.contains("HTML/CSS"));
		System.out.println(set.contains("C++"));
		
		//내용 비우기
//		set.clear();
		System.out.println(set);
		
		//set이 비어있냐?
		System.out.println(set.isEmpty());
		
		//데이터 전체 조회 - 1
		for(String str : set) {
			System.out.println(str);
		}
		System.out.println("-----------------");
		//데이터 전체 조회 - 2
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//set -> list 변환
		ArrayList<String> list = new ArrayList<String>(set);
		System.out.println(list);
		
		//list -> set 변환
		HashSet<String> s = new HashSet<String>(list);
		System.out.println(s);
	}

}









