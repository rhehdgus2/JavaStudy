public class Example9_1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);  // Value 클래스의 인스턴스 생성 (v1)
		Value v2 = new Value(10);  // Value 클래스의 또 다른 인스턴스 생성 (v2)
		
		if(v1.equals(v2))  // v1과 v2의 equals 메서드 비교
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}  // main
}

class Value {
	int value;  // int형 변수 value 선언
	
	Value(int value) {
		this.value = value;  // 생성자를 통해 전달받은 값으로 초기화
	}
}