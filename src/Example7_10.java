// 다중 상속과 인터페이스의 메서드 충돌을 해결하는 예제 코드
public class Example7_10 {
    public static void main(String[] args) {
        // Child3 클래스의 인스턴스 생성
        Child3 c = new Child3();
        
        // 오버라이딩된 method1 호출
        c.method1();
        
        // Parent3 클래스의 method2 호출
        c.method2();
        
        // MyInterface의 staticMethod 호출
        MyInterface.staticMethod();
        
        // MyInterface2의 staticMethod 호출
        MyInterface2.staticMethod();
    }
}

// Parent3 클래스 정의
class Parent3 {
    public void method2() {
        System.out.println("method2() in Parent3");
    }
}

// MyInterface 인터페이스 정의
interface MyInterface {
    // 디폴트 메서드 method1 정의
    default void method1() {
        System.out.println("method1() in MyInterface");
    }

    // 디폴트 메서드 method2 정의
    default void method2() {
        System.out.println("method2() in MyInterface");
    }

    // 정적 메서드 staticMethod 정의
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

// MyInterface2 인터페이스 정의
interface MyInterface2 {
    // 디폴트 메서드 method1 정의
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }

    // 정적 메서드 staticMethod 정의
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}

// Child3 클래스 정의, Parent3 상속, MyInterface와 MyInterface2 구현
class Child3 extends Parent3 implements MyInterface, MyInterface2 {
    // MyInterface의 method1을 오버라이딩
    public void method1() {
        System.out.println("method1() in Child3"); // 오버라이딩
    }
}