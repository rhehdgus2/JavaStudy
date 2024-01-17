// 내부 클래스와 static 내부 클래스의 예제 코드
class Example7_11 {
    // 인스턴스 멤버 클래스
    class InstanceInner {
        int iv = 100;
        // static int cv = 100;  // 에러, static 변수를 선언할 수 없음
        final static int CONST = 100;  // final static은 상수이므로 허용
    }

    // static 멤버 클래스
    static class StaticInner {
        int iv = 200;
        static int cv = 200;  // static 클래스만 static 멤버를 정의 가능
    }

    // 메서드 내부의 지역 클래스
    void myMethod() {
        class LocalInner {
            int iv = 300;
            // static int cv = 300;  // 에러, static 변수를 선언할 수 없음
            final static int CONST = 300;  // final static은 상수이므로 허용
        }
    }

    // main 메서드
    public static void main(String args[]) {
        // 외부 클래스의 인스턴스를 생성하고, 내부 클래스의 상수 출력
        System.out.println(InstanceInner.CONST);

        // 내부 클래스가 static으로 선언된 경우, 외부 클래스의 인스턴스 없이 접근 가능
        System.out.println(StaticInner.cv);
    }
}