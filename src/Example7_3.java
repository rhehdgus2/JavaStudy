// 메인 클래스 정의
public class Example7_3 {
	public static void main(String[] args) {
		Child2 c = new Child2();  // 자식 클래스의 인스턴스 생성
		c.method();             // 자식 클래스의 메서드 호출
	}
}
//부모 클래스 정의
class Parent2 {
	int x = 10;  // super.x와 this.x 둘 다 가능
}

class Child2 extends Parent2 {
	// 메서드 정의
	void method() {
		// x: 현재 클래스(자식 클래스)의 인스턴스 변수 x 출력
		System.out.println("x = " + x);
        // this.x: 현재 클래스(자식 클래스)의 인스턴스 변수 x 출력 (this는 생략 가능)
		System.out.println("this.x = " + this.x);
		// super.x: 부모 클래스의 인스턴스 변수 x 출력
		System.out.println("super.x = " + super.x);
	}
}