package Chapter6;

class Data {
    int x;  // 인스턴스 변수 x를 가진 Data 클래스 정의
}

public class Example6_5 {
    public static void main(String[] args) {
        Data d = new Data();  // Data 클래스의 인스턴스 생성 및 변수 d에 할당
        d.x = 10;  // 인스턴스 변수 x에 값 10을 할당
        System.out.println("main() : x = " + d.x);  // 현재 x의 값을 출력

        change(d.x);  // change 메서드 호출, 기본형 매개변수로 값 전달
        System.out.println("After change(d.x)");  // 메서드 호출 후 출력
        System.out.println("main() : x = " + d.x);  // 메서드 호출 이후의 x 값 출력
    }

    static void change(int x) {  // 기본형 매개변수를 받는 메서드 정의
        x = 1000;  // 매개변수 x에 값 1000을 할당
        System.out.println("change() : x = " + x);  // 변경된 x 값을 출력
    }
}