class Person {
    long id;  // Person의 식별자(id)를 저장하는 멤버 변수

    // equals 메서드 오버라이드
    public boolean equals(Object obj) {
        if (obj instanceof Person)
            // obj가 Object 타입이므로 id 값을 참조하기 위해서는 Person 타입으로 형변환이 필요
            return id == ((Person) obj).id;  // 두 Person 객체의 id 값 비교
        else
            return false;  // 타입이 Person이 아니면 값을 비교할 필요도 없다.
    }

    // Person 생성자
    Person(long id) {
        this.id = id;  // 생성자를 통해 id 값 설정
    }
}

public class Example9_2 {
    public static void main(String[] args) {
        // Person 객체 생성
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        // equals 메서드를 통한 두 Person 객체의 동등성 비교
        if (p1.equals(p2))
            System.out.println("p1과 p2는 같은 사람입니다.");
        else
            System.out.println("p1과 p2는 다른 사람입니다.");
    }
}