package Chapter6;

class Car {
    String color;     // 색상
    String gearType;  // 변속기 종류 - auto(자동), manual(수동)
    int door;         // 문의 개수
    
    // 기본 생성자
    Car() {}
    
    // 매개변수를 받는 생성자
    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

public class Example6_10 {
    public static void main(String[] args) {
        // 객체 생성 후 인스턴스 변수에 값을 할당하는 방법
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;
        
        // 매개변수를 사용하여 객체 생성하는 방법
        Car c2 = new Car("white", "auto", 4);
        
        // 객체 정보 출력
        System.out.println("c1의 color = " + c1.color + ", gearType = " 
        					+ c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " 
        					+ c2.gearType + ", door = " + c2.door);
    }
}