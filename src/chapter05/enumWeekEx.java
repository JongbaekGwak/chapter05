package chapter05;

import java.util.Calendar;

public class enumWeekEx {

	public static void main(String[] args) {
		Week today = null;

//		자바에서 사용하는 날짜 및 시간에 관련된 클래스
		Calendar cal = Calendar.getInstance();	//	java에서 지원 하는 달력 클래스 : 날짜와 시간 계산시 사용
//		Calendar.DAY_OF_WEEK는 요일을 숫자로 표현하여 변환
		int week = cal.get(Calendar.DAY_OF_WEEK);	//	한주를 숫자로 표현(현재 시간)

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}

		System.out.println("오늘 요일 : " + today);

		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}

	}

}
