package Chapter15;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Example15_8 {
	public static void main(String[] args) {
		try {
			// 파일 경로에 해당하는 문자열을 fileName에 저장
			String fileName = ".\\src\\Chapter15\\test.txt";
			
			// FileInputStream을 이용해서 파일 내용을 읽어 화면에 출력
			FileInputStream fis = new FileInputStream(fileName);
			
			// FileReader를 이용해서 파일 내용을 읽어 화면에 출력
			FileReader fr = new FileReader(fileName);
			
			int data = 0;
			// FileInputStream을 이용해서 파일 내용을 읽어 화면에 출력
			while((data = fis.read())!= -1) {
				System.out.print((char)data);
			}
			System.out.println();
			fis.close();  // FileInputStream을 닫는다.
			
			// FileReader를 이용해서 파일 내용을 읽어 화면에 출력
			while((data = fr.read())!= -1)
				System.out.print((char)data);
			System.out.println();
			fr.close();  // FileReader를 닫는다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}  // main
}