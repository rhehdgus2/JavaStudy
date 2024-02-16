package Chapter15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Example15_19 {
	public static void main(String[] args) {
		try {
			// 직렬화할 파일의 이름
			String fileName = "UserInfo.ser";
			
			// 파일 출력 스트림 생성
			FileOutputStream fos = new FileOutputStream(fileName);
			
			// 버퍼링된 출력 스트림 생성
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			// 객체를 직렬화하는 스트림 생성
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			// UserInfo 객체 생성
			UserInfo u1 = new UserInfo("JavaMan", "1234", 30);
			UserInfo u2 = new UserInfo("JavaWoman", "4321", 26);
			
			// ArrayList에 UserInfo 객체 추가
			ArrayList<UserInfo> list = new ArrayList<>();
			list.add(u1);
			list.add(u2);
			
			// 객체를 직렬화한다.
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			
			// 출력 스트림 닫기
			out.close();
			System.out.println("직렬화가 잘 끝났습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}  // main
}  // class