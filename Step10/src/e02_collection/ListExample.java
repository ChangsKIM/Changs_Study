package e02_collection;

import java.util.ArrayList;

public class ListExample {
	/*		
	 * 		List 특징
	 * 			1. 데이터 중복
	 * 			2. 리스트에 저장된 데이터 순서가 보장됨
	 * 
	 * 		ArrayList : 리스트에서 데이터를 배열로 관리
	 * 		LinkedList : 리스트에서 데이터를 노드 단위로 관리
	 * 		Vector : ArrayList와 동일, 동기화가 추가
	 * 
	 */
	public static void main(String[] args) {
		//리스트 생성
		//ArrayList<리스트에 저장할 데이터의 참조형타입>
		ArrayList<String> list = new ArrayList<String>();
		
		//데이터 추가
		list.add("HTML/CSS");
		list.add("js/jQuery");
		list.add("java");
		list.add("react");
		list.add("jsp");
		list.add("java");
		list.add("jsp");
		
		System.out.println(list);
		
		//데이터 삭제 - 인덱스 번호로 삭제
		list.remove(2);
		System.out.println(list);
		
		//데이터 삭제 - 데이터 값을 기준으로 삭제, 첫번째로 검색된 값 1개만 삭제
		list.remove("jsp");
		System.out.println(list);
		
		//리스트에 저장된 데이터 개수
		System.out.println(list.size());
		
		//리스트에 저장된 특정 인덱스의 데이터를 교체
		list.set(1, "C");
		System.out.println(list);
		
		//데이터를 원하는 인덱스 위치에 추가
		list.add(1, "C++");
		System.out.println(list);
		
		//해당 데이터가 리스트에 있냐?
		System.out.println(list.contains("react"));
		System.out.println(list.contains("sql"));
		//데이터가 몇번째 위치에 있는지?
		System.out.println(list.indexOf("react"));
		System.out.println(list.indexOf("sql"));
		//리스트에 있는 모든 데이터를 삭제
		
		//리스트에 내용이 하나도 없냐?
	}

}







