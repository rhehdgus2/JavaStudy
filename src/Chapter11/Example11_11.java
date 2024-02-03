package Chapter11;

import java.util.HashSet;

public class Example11_11 {
	public static void main(String[] args) {
		// HashSet 객체 생성
		HashSet set = new HashSet();
		
		// "abc" 문자열과 Person 객체를 HashSet에 추가
		set.add("abc");
		set.add("abc");  // 중복된 "abc" 문자열이므로 추가되지 않음
		// Person 객체 내용이 같으므로 중복으로 간주되어 추가되지 않음
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		// HashSet 출력
		System.out.println(set);
	}
}
//Person 클래스 정의
class Person {
	String name;
	int age;
	
	// Person 생성자
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 객체를 문자열로 표현하는 메서드 재정의
	public String toString() {
		return name + " : " + age;
	}
}