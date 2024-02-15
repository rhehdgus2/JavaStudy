package Chapter15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example15_11 {
	public static void main(String[] args) {
		try {
            // 파일 리더 생성
			FileReader fr = new FileReader(".\\src\\Chapter15\\Example15_11.java");
			// 버퍼 리더 생성
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			// 라인 순서를 나타내기 위한 변수 i 사용
			for(int i = 1;(line = br.readLine())!= null; i++) {
				// ";"를 포함한 라인을 출력
				if(line.indexOf(";")!= -1)
					System.out.println(i + ":" + line);
			}
			
			br.close();  // 버퍼 리더 닫기
		} catch(IOException e) {}
	}  // main
}