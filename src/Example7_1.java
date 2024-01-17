// TV 클래스 정의
class Tv {
    boolean power;      // 전원 상태(on / off)
    int channel;        // 채널

    void power() {
        power = !power;  // 전원을 켜거나 끄는 메서드
    }

    void channelUp() {
        ++channel;       // 채널을 증가시키는 메서드
    }

    void channelDown() {
        --channel;       // 채널을 감소시키는 메서드
    }
}

// SmartTv는 Tv를 상속하는 클래스
class SmartTv extends Tv {
    boolean caption;    // 캡션 상태(on / off)

    void displayCaption(String text) {
        if (caption) {   // 캡션 상태가 켜져 있을 때만 특정 텍스트를 출력하는 메서드
            System.out.println(text);
        }
    }
}

// 메인 클래스
public class Example7_1 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();   // SmartTv 인스턴스 생성

        stv.channel = 10;              // Tv 클래스로부터 상속받은 멤버 변수 조작
        stv.channelUp();               // Tv 클래스로부터 상속받은 메서드 호출
        System.out.println(stv.channel);

        stv.displayCaption("Hello, World");  // SmartTv의 추가된 메서드 호출
        stv.caption = true;                   // SmartTv의 멤버 변수 조작
        stv.displayCaption("Hello, World");  // SmartTv의 추가된 메서드 호출
    }
}