package Chapter7;

//메인 클래스 정의
public class Example7_2 {
	public static void main(String[] args) {
		Child c = new Child();  // 자식 클래스의 인스턴스 생성
		c.method();             // 자식 클래스의 메서드 호출
	}
}
//부모 클래스 정의
class Parent {
	int x = 10;  // super.x
}
//자식 클래스 정의, 부모 클래스를 상속
class Child extends Parent {
	int x = 20;  // this.x
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