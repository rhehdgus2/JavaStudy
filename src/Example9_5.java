class Card2 {
	String kind;
	int number;
	
	Card2() {
		this("SPADE", 1);  // Card2(String kind, int number)를 호출하여 기본값 설정
	}
	
	Card2(String kind, int number) {
		this.kind = kind;  // 매개변수로 받은 값으로 kind 초기화
		this.number = number;  // 매개변수로 받은 값으로 number 초기화
	}
	
	public String toString() {
		// Card2 인스턴스의 kind와 number를 문자열로 반환
		return "kind: " + kind + ", number: " + number;
	}
}

public class Example9_5 {
	public static void main(String[] args) {
		Card2 c1 = new Card2();  // 기본 생성자 호출하여 인스턴스 생성 (기본값 사용)
		Card2 c2 = new Card2("HEART", 10);  // 매개변수 있는 생성자 호출하여 인스턴스 생성
		System.out.println(c1.toString());  // 첫 번째 Card2 인스턴스 정보 출력
		System.out.println(c2.toString());  // 두 번째 Card2 인스턴스 정보 출력
	}
}