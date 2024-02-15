package Chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example15_12 {
	public static void main(String[] args) {
		String line = "";
		
		try {
			// 표준 입력(System.in)을 InputStreamReader로 감싸고, BufferedReader로 한 줄씩 읽을 수 있게 함
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			// 사용 중인 OS의 인코딩 출력
			System.out.println("사용중인 OS의 인코딩 : " + isr.getEncoding());
			
			do {
				// 사용자로부터 문장을 입력 받음
				System.out.print("문장을 입력하세요. 마치시려면 q를 입력하세요.>");
				line = br.readLine();
				// 입력한 문장을 출력
				System.out.println("입력하신 문장 : " + line);
			} while(!line.equalsIgnoreCase("q"));
			
//			br.close();  // BufferedReader를 닫지 않아도 됨(System.in과 같은 표준입출력은 닫지 않아도 된다)
			System.out.println("프로그램을 종료합니다.");
		} catch(IOException e) {}
	}
}