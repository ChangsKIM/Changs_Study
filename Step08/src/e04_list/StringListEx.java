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
	}

}
