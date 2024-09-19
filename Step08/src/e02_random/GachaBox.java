package e02_random;

import java.util.Random;

public class GachaBox {
	private final int[] GRADE_EA;
	private int BOX_EA = 10000;
	
	public GachaBox() {
		GRADE_EA = new int[] {
			(int)(0.04 * BOX_EA),
			(int)(0.18 * BOX_EA),
			(int)(0.78 * BOX_EA)
		};
	}
	
	public String[] generateGachaBox() {
		//가챠 박스
		String[] arr = new String[BOX_EA];
		//아이템
		String[] grade = {"특수", "달인", "정예"};
		
		for(int i=0, idx = 0;i<grade.length;i++) {
			for(int j=0;j<GRADE_EA[i];j++)
				arr[idx++] = grade[i];
		}
		Random r = new Random();
		//arr내용을 랜덤으로 섞음
		for(int i=0;i<arr.length;i++) {
			int n = r.nextInt(arr.length);
			String temp = arr[i];
			arr[i] = arr[n];
			arr[n] = temp;
		}
		return arr;
	}
	
	public String[] drawItem(int ea) {
		//원하는 개수만큼 뽑아서 배열로 만들고
		//뽑은 결과를 리턴
		return null;
	}
	
	public static void main(String[] args) {
		GachaBox box = new GachaBox();
		String[] arr = box.generateGachaBox();
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	
	
}
