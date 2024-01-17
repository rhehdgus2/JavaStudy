class Outer {
    private int outerIv = 0;
    static int outerCv = 0;

    // 인스턴스 멤버 클래스
    class InstanceInner {
        int iiv = outerIv;  // 외부 클래스의 private 멤버도 접근 가능
        int iiv2 = outerCv;
    }

    // 스태틱 멤버 클래스
    static class StaticInner {
// 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 직접 접근할 수 없다.
// 		int siv = outerIv;  // 에러
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0;  // JDK 1.8부터 final 생략 가능

        // 지역 내부 클래스
        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
// 외부 클래스의 지역 변수는 final이 붙은 변수(상수)만 접근 가능
// 			int liv3 = lv;  // 에러(JDK1.8부터 에러 아님)
            int liv4 = LV;
        }
    }
}