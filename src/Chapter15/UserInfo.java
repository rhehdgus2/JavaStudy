package Chapter15;

//java.io.Serializable 인터페이스를 구현하는 UserInfo 클래스
public class UserInfo implements java.io.Serializable {
	// 클래스의 필드 선언
	String name;
	String password;
	int age;
	
	// 기본 생성자
	public UserInfo() {
		// 기본 생성자에서 다른 생성자 호출
		this("Unknown", "1111", 0);
	}
	
	// 매개변수를 받는 생성자
	public UserInfo(String name, String password, int age) {
		// 필드 초기화
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	// 객체를 문자열로 표현하는 메서드
	public String toString() {
		return "(" + name + "," + password + "," + age + ")";
	}
}