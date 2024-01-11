class Data2 {
    int x;  // 인스턴스 변수 x를 가진 Data2 클래스 정의
}

public class Example6_6 {
    public static void main(String[] args) {
        Data2 d = new Data2();  // Data2 클래스의 인스턴스 생성 및 변수 d에 할당
        d.x = 10;  // 인스턴스 변수 x에 값 10을 할당
        System.out.println("main() : x = " + d.x);  // 현재 x의 값을 출력

        change(d);  // change 메서드 호출, 참조형 매개변수로 객체 전달
        System.out.println("After change(d)");  // 메서드 호출 후 출력
        System.out.println("main() : x = " + d.x);  // 메서드 호출 이후의 x 값 출력
    }

    static void change(Data2 d) {  // 참조형 매개변수를 받는 메서드 정의
        d.x = 1000;  // 참조변수 d의 인스턴스의 x 값을 1000으로 변경
        System.out.println("change() : x = " + d.x);  // 변경된 x 값을 출력
    }
}