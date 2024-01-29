package Chapter10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example10_9 {
	public static void main(String[] args) {
		// 날짜 형식을 설정하는 DateFormat 객체 생성
		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			// 문자열을 날짜로 파싱 ("2024년 01월 01일"을 파싱)
			Date d = df.parse("2024년 01월 01일");
			// 다른 형식으로 날짜를 출력
			System.out.println(df2.format(d));
		} catch(Exception e) {} // 예외가 발생하면 예외 내용을 출력
	}  // main
}