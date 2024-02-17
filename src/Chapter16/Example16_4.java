package Chapter16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Example16_4 {
	public static void main(String[] args) {
		// URL 객체 초기화
		URL url = null;
		
		// BufferedReader 초기화
		BufferedReader input = null;
		
		// 읽어올 URL 주소
		String address = "http://www.naver.com";
		
		// 한 줄씩 읽어들인 문자열을 저장할 변수
		String line = "";
		
		try {
			// URL 객체 생성
			url = new URL(address);
			
			// URL을 통해 BufferedReader로 데이터 읽기
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			
			// 한 줄씩 읽어 출력
			while((line = input.readLine()) != null) {
				System.out.println(line);
			}
			
			// BufferedReader 닫기
			input.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}  // main
}


