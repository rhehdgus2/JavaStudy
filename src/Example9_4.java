class Card {
    String kind;  // 카드의 종류
    int number;   // 카드의 숫자

    // 기본 생성자
    Card() {
        this("SPADE", 1);  // 기본 생성자에서 다른 생성자 호출
    }

    // 매개변수를 받는 생성자
    Card(String kind, int number) {
        this.kind = kind;     // 매개변수로 받은 값으로 멤버 변수 초기화
        this.number = number;  // 매개변수로 받은 값으로 멤버 변수 초기화
    }
}

public class Example9_4 {
    public static void main(String[] args) {
        // 두 개의 Card 객체 생성
        Card c1 = new Card();
        Card c2 = new Card();

        // toString 메서드를 통한 객체의 문자열 표현 출력
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}