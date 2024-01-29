package Chapter10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Example10_10 {
	public static void main(String[] args) {
		// 날짜 형식을 설정하는 패턴
		String pattern = "yyyy/MM/dd";
		// SimpleDateFormat 객체를 생성하여 패턴 적용
		DateFormat df = new SimpleDateFormat(pattern);
		// Scanner 객체를 생성하여 사용자로부터 날짜 입력 받기
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		// 사용자로부터 올바른 날짜 형식을 입력받을 때까지 반복
		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.(입력 예 : 2019/12/31)");
		while(s.hasNextLine()) {
			try {
				// 입력받은 문자열을 Date 객체로 파싱
				inDate = df.parse(s.nextLine());
				break;
			} catch(Exception e) {
				System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요.(입력 예 : 2019/12/31)");
			}
		}  // while
		
		// Calendar 객체를 생성하고 입력받은 날짜를 설정
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		// 현재 날짜를 나타내는 Calendar 객체 생성
		Calendar today = Calendar.getInstance();
		// 두 날짜 사이의 차이를 계산 (시간 단위로 변환)
		long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);
		System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다.");
	}  // main
}