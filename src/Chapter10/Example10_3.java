package Chapter10;

import java.util.Calendar;

public class Example10_3 {
	public static void main(String[] args) {
		final int[] TIME_UNIT = {3600, 60, 1};  // 큰 단위를 앞에 놓는다.
		final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초 "};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10);  // time1을 10시 20분 30초로 설정
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20);  // time2을 20시 30분 10초로 설정
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1 : " + time1.get(Calendar.HOUR_OF_DAY) + "시 "
				+ time1.get(Calendar.MINUTE) + "분 " + time1.get(Calendar.SECOND) + "초");
		System.out.println("time2 : " + time2.get(Calendar.HOUR_OF_DAY) + "시 "
				+ time2.get(Calendar.MINUTE) + "분 " + time2.get(Calendar.SECOND) + "초");
		
		// 두 시간 간의 차이를 초 단위로 계산
		long difference = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
		System.out.println("time1과 time2의 차이는 " + difference + "초 입니다.");
		
		// 초를 큰 단위부터 나누어 변환하여 출력
		String tmp = "";
		for(int i = 0; i < TIME_UNIT.length; i++) {
			// 초를 큰 단위부터 나누어 해당 단위의 개수를 구하고 문자열에 추가
			tmp += difference / TIME_UNIT[i] + TIME_UNIT_NAME[i];
			// 다음 단위로 넘어가기 위해 초에서 해당 단위로 나눈 나머지를 구함
			difference %= TIME_UNIT[i];
		}
		System.out.println("시분초로 변환하면 " + tmp + "입니다.");
	}
}