import java.util.Scanner;

public class E25_Quest {

	public static void main(String[] args) {
		//정수형 배열 생성, 길이 10
		//Scanner 생성
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		//반복문 - 무한루프
		while(true) {
			System.out.println("1 - 숫자 추가");
			System.out.println("2 - 숫자 삭제");
			System.out.println("3 - 전체 숫자 출력");
			System.out.println("0 - 프로그램 종료");
			System.out.print("원하시는 번호를 입력 하세요 : ");
			int no = sc.nextInt();
			
			if(no == 0) {
				break;
			}else if(no == 1) {
				//단 배열에 저장할 공간이 없으면 배열길이 5씩 늘린 후에 저장
				if(idx == arr.length) {
					int[] temp = new int[arr.length+5];
					System.arraycopy(arr, 0, temp, 0, arr.length);
					arr = temp;
				}
				//숫자 입력 받아서
				System.out.print("추가할 숫자 입력 > ");
				//배열에 추가
				arr[idx++] = sc.nextInt();
			}else if(no == 2) {
				//삭제할 데이터 입력
				System.out.println("데이터 삭제를 시작합니다....");
				System.out.print("삭제할 숫자 입력 : ");
				int n = sc.nextInt();				
				//삭제할 데이터를 찾음
				for(int i=0;i<idx;i++) {
					//	1. 삭제할 데이터가 있는 경우 데이터를 한칸씩 땡겨옴
					if(arr[i] == n) {
						for(int j = i;j<idx-1;j++) {
							arr[j] = arr[j+1];
						}
						idx--;
						break;
					}
				}
				
				// '데이터 삭제 완료' 출력
				// '삭제할 데이터가 없습니다' 출력
				
			}else if(no == 3) {
				//전체 출력
				System.out.println("전체 데이터를 출력합니다....");
				for (int i = 0; i < idx; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}
		}
	}

}







