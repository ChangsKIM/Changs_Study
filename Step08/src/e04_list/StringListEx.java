package e04_list;

import java.util.ArrayList;

public class StringListEx {

	public static void main(String[] args) {
		//문자열 저장하는 ArrayList 생성
		ArrayList<String> list = new ArrayList<String>();
		//문자열 데이터 5건 저장
		list.add("Java");
		list.add("HTML/CSS");
		list.add("javascript");
		list.add("react");
		list.add("Oracle");
		
		System.out.println(list);
		
		//데이터 삭제
		String result = list.remove(2);
		System.out.println(result);
		System.out.println(list);
		System.out.println(list.remove("react"));
		System.out.println(list.remove("react"));
		System.out.println(list);
		
		//전체 조회 반복문
		for(String str : list) {
			System.out.println(str);
		}
	}

}






