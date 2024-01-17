// 제품을 구매하는 예제
// 제품 클래스 정의
class Product {
    int price;          // 제품의 가격
    int bonusPoint;     // 제품 구매 시 제공하는 보너스 점수
    // 생성자
    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);  // 보너스 점수는 제품 가격의 10%
    }
}
// TV 클래스 정의, Product 클래스를 상속
class Tv1 extends Product {
    // 생성자
    Tv1() {
        // 조상 클래스의 생성자 Product(int price)를 호출
        super(100);        // Tv의 가격을 100만원으로 설정
    }
    // Object 클래스의 toString()을 오버라이딩
    public String toString() {
        return "Tv";
    }
}
// Computer 클래스 정의, Product 클래스를 상속
class Computer extends Product {
    // 생성자
    Computer() {
        super(200);
    }
    // Object 클래스의 toString()을 오버라이딩
    public String toString() {
        return "Computer";
    }
}
// 고객 클래스 정의
class Buyer {
    int money = 1000;        // 소유 금액
    int bonusPoint = 0;      // 보너스 점수

    // 물건을 사는 메서드
    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;                   // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;         // 제품의 보너스 점수를 추가한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}
// 메인 클래스 정의
public class Example7_7 {
    public static void main(String[] args) {
        Buyer b = new Buyer();    // 고객 인스턴스 생성

        b.buy(new Tv1());         // Tv1 인스턴스를 구입
        b.buy(new Computer());    // Computer 인스턴스를 구입
        // 현재 상태 출력
        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
    }
}