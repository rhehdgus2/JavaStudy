package Chapter10;

import java.text.DecimalFormat;

public class Example10_7 {
	public static void main(String[] args) {
		// 숫자 포맷을 설정하는 DecimalFormat 객체 생성
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			// 문자열을 숫자로 파싱 (1,234,567.89을 파싱)
			Number num = df.parse("1,234,567.89");
			System.out.print("1,234,567.89" + " -> ");
			
			// 숫자 값을 double로 얻어와 출력
			double d = num.doubleValue();
			System.out.print(d + " -> ");
			
			// 두 번째 포맷 형식으로 변환하여 출력
			System.out.println(df2.format(num));
		} catch(Exception e) {}  // 예외가 발생하면 예외 내용을 출력
	}  // main
}
