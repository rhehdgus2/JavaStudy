package Chapter12;

import java.util.ArrayList;
import java.util.Iterator;

public class Example12_2 {
	public static void main(String[] args) {
		// Student 타입을 저장하는 ArrayList 생성
		ArrayList<Student> list = new ArrayList<Student>();
		
		// Student 객체 추가
		list.add(new Student("자바왕", 1, 1));
		list.add(new Student("자바짱", 1, 2));
		list.add(new Student("홍길동", 2, 1));
		
		// Iterator를 이용하여 ArrayList의 요소 출력
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
		//  Student s = (Student)it.next();  // 지네릭스를 사용하지 않으면 형변환 필요
			Student s = it.next();
			System.out.println(s.name);
		}
	}  // main
}

class Student {
	String name = "";
	int ban;
	int no;
	
	// 생성자를 통해 학생 정보 초기화
	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}