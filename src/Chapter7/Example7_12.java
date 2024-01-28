package Chapter7;

//내부 클래스와 외부 클래스 멤버 간의 접근 예제 코드
class Example7_12 {
 // 인스턴스 멤버 클래스
 class InstanceInner {}

 // static 멤버 클래스
 static class StaticInner {}

 // 인스턴스 멤버 간에는 서로 직접 접근이 가능
 InstanceInner iv = new InstanceInner();
 static StaticInner cv = new StaticInner();

 // static 메서드에서는 static 멤버에만 직접 접근 가능
 static void staticMethod() {
     // static 멤버 클래스는 외부에서 직접 생성 가능
     StaticInner obj2 = new StaticInner();

     // 인스턴스 멤버 클래스를 생성하려면 외부 클래스의 인스턴스를 먼저 생성해야 함
     Example7_12 outer = new Example7_12();
     InstanceInner obj1 = outer.new InstanceInner();
 }

 // 인스턴스 메서드에서는 인스턴스 멤버와 static 멤버 모두 접근 가능
 void instanceMethod() {
     InstanceInner obj1 = new InstanceInner();
     StaticInner obj2 = new StaticInner();
 }

 // 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
 void myMethod() {
     class LocalInner {}
     LocalInner lv = new LocalInner();
 }
}