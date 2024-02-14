package Chapter15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example15_6 {
	public static void main(String[] args) {
		try {
			// FileOutputStream을 사용하여 123.txt 파일에 데이터를 쓰는 예제
			FileOutputStream fos = new FileOutputStream(".\\src\\Chapter15\\123.txt");
			// BufferedOutputStream의 버퍼 크기를 5로 한다.
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			// 파일 123.txt에 1부터 9까지 출력한다.
			for(int i = '1'; i <= '9'; i++) {
				// BufferedOutputStream을 통해 데이터를 버퍼에 기록
				bos.write(i);
			}
			
			// BufferedOutputStream을 닫으면서 버퍼에 남아있는 데이터를 출력한다.
			// bos.close();
			
			// FileOutputStream을 닫는다.
			fos.close(); // FileOutputStream을 닫는다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


