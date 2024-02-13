package Chapter15;

import java.io.FileInputStream;
import java.io.IOException;

public class Example15_4 {			// Example15_4 : FileViewer
	public static void main(String[] args) throws IOException {
		// 파일 경로에 해당하는 FileInputStream 생성
		FileInputStream fis = new FileInputStream(".\\src\\Chapter15\\Example15_4.java");
		
		int data = 0;
		
		// FileInputStream을 통해 파일의 내용을 읽고 출력
		while((data = fis.read())!= -1) {
			// 읽은 데이터를 char로 변환하여 출력
			char c = (char)data;
			System.out.print(c);
		}
	}
}