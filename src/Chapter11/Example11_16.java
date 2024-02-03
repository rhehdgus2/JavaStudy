package Chapter11;

import java.util.HashMap;
import java.util.Scanner;

public class Example11_16 {
	public static void main(String[] args) {
		// HashMap 객체 생성
		HashMap map = new HashMap();
		
		// 키와 값 추가
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");  // OK. 이미 존재하는 키 추가가능. 기존 값은 없어짐
		
		// Scanner 객체 생성
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : ");
			String id = s.nextLine().trim();
			
			System.out.print("password : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			// 입력된 id가 존재하는지 확인
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			
			// 입력된 password가 일치하는지 확인
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			} else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}  // while
	}  // main의 끝
}