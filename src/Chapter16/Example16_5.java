package Chapter16;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Example16_5 {
	public static void main(String[] args) {
		// URL, InputStream, FileOutputStream 초기화
		URL url = null;
		InputStream in = null;
		FileOutputStream out = null;
		
		// 다운로드 받을 URL 주소
		String address = "http://www.naver.com";
		
		// 데이터를 읽어올 때 사용할 변수
		int ch = 0;
		
		try {
			// URL 객체 생성
			url = new URL(address);
			
			// InputStream 객체 생성
			in = url.openStream();
			
			// FileOutputStream 객체 생성 (다운로드 받은 데이터를 저장할 파일명 지정)
			out = new FileOutputStream("javabasic_src.zip");
			
			// 한 바이트씩 읽어오고 저장
			while((ch = in.read()) != -1) {
				out.write(ch);
			}
			
			// 사용한 자원들을 닫아줌
			in.close();
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}  // main
}