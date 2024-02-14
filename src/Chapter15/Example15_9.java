package Chapter15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example15_9 {
	public static void main(String[] args) {
		try {
			// FileReader를 사용하여 소스 파일을 읽어옴
			FileReader fr = new FileReader(".\\src\\Chapter15\\Example15_9.java");
			
			// FileWriter를 사용하여 변환된 내용을 저장할 파일을 생성
			FileWriter fw = new FileWriter(".\\src\\Chapter15\\convert.txt");
			
			int data = 0;
			// 파일을 읽어오면서 탭, 개행, 공백, 캐리지 리턴을 제외한 문자를 FileWriter를 사용하여 새로운 파일에 씀
			while((data = fr.read())!= -1) {
				if(data!='\t' && data!='\n' && data!=' ' && data !='\r')
					fw.write(data);
			}
			
			fr.close();  // FileReader를 닫음
			fw.close();  // FileWriter를 닫음
		} catch (IOException e) {
			e.printStackTrace();
		}
	}  // main
}