package e09_calendar;

import java.util.Calendar;
import java.util.Date;

public class DDay {

	public static void main(String[] args) {
		//오늘 날짜부터 수능까지 몇일?
		//오늘 날짜
		Date today = new Date("2024/10/01");
		//수능 날짜
		Date soo = new Date(124,10,14);
		
		//오늘 날짜와 수능 날짜를 빼면 오늘 날짜부터 수능 날짜까지 날짜시간값이 나옴
		//하루단위로 환산하면 수능날까지의 D데이가 나옴
		//밀리초 -> 1000 -> 1초
		long dday = (soo.getTime() - today.getTime())/(1000*60*60*24);
		System.out.println(dday);
		
		//Calendar로 변경해서 출력
		Calendar t = Calendar.getInstance();
		Calendar s = Calendar.getInstance();
		s.set(2024, 10, 14);
		
		System.out.println(s.get(Calendar.DAY_OF_YEAR) 
				- t.get(Calendar.DAY_OF_YEAR));
	}

}



