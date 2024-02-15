package Chapter15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Example15_14 {
	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			// FileOutputStream을 사용하여 파일 출력 스트림 생성
			fos = new FileOutputStream(".\\src\\Chapter15\\text2.txt");
			// PrintStream을 사용하여 파일 출력 스트림에 연결
			ps = new PrintStream(fos);
			System.setOut(ps);  // System.out의 출력대상을 test2.txt파일로 변경
		} catch(FileNotFoundException e) {
			// 파일을 찾을 수 없는 경우 예외 처리
			System.err.println("File not found.");
		}
		
		// System.out으로 출력되는 내용은 text2.txt 파일로 저장됨
		System.out.println("Hello by System.out");
		System.out.println("Hello by System.err");
	}
}