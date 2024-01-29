package Chapter10;

import java.util.Calendar;

public class Example10_4 {
	public static void main(String[] args) {
		// 현재 날짜와 시간으로 설정된 Calendar 인스턴스 생성
		Calendar date = Calendar.getInstance();
		// 2024년 1월 1일로 날짜 설정
		date.set(2024, 0, 1);
		
		// 초기 날짜 출력
		System.out.println(toString(date));
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("= 6달 전 =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("= 31일 후(roll) =");
		// 날짜를 31일 뒤로 설정 (roll 메서드는 월을 변경하지 않음)
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		System.out.println("= 31일 후(add) =");
		// 날짜를 31일 뒤로 설정 (add 메서드는 월을 변경)
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
	}
	
	// Calendar 인스턴스를 받아서 "년 월 일" 형태의 문자열로 반환하는 메서드
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1)
									+"월 " + date.get(Calendar.DATE) + "일";
	}

}