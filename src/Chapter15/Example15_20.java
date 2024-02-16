package Chapter15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Example15_20 {
	public static void main(String[] args) {
		try {
			// 역직렬화할 파일의 이름
			String fileName = "UserInfo.ser";
			
			// 파일 입력 스트림 생성
			FileInputStream fis = new FileInputStream(fileName);
			
			// 버퍼링된 입력 스트림 생성
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			// 객체를 역직렬화하는 스트림 생성
			ObjectInputStream in = new ObjectInputStream(bis);
			
			// 역직렬화하여 객체 읽어오기(객체를 읽을 때는 출력한 순서와 일치해야함)
			UserInfo u1 = (UserInfo)in.readObject();
			UserInfo u2 = (UserInfo)in.readObject();
			ArrayList list = (ArrayList)in.readObject();
			
			// 읽어온 객체 출력
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			
			// 입력 스트림 닫기
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}  // main
} // class


