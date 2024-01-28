package Chapter6;

class Car2 {
    String color;     // 색상
    String gearType;  // 변속기 종류 - auto(자동), manual(수동)
    int door;         // 문의 개수
    
    // 기본 생성자 - 매개변수를 사용하여 또 다른 생성자 호출
    Car2() {
        this("white", "auto", 4);  // 다른 생성자 호출
    }
    
    // 색상을 받는 생성자 - 매개변수를 사용하여 또 다른 생성자 호출
    Car2(String color) {
        this(color, "auto", 4);  // 다른 생성자 호출
    }
    
    // 모든 정보를 받는 생성자
    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class Example6_11 {
    public static void main(String[] args) {
        // 다양한 생성자를 사용하여 객체 생성
        Car2 c1 = new Car2();  // 기본 생성자 호출
        Car2 c2 = new Car2("blue");  // 색상을 받는 생성자 호출
        
        // 객체 정보 출력
        System.out.println("c1의 color = " + c1.color + ", gearType = " 
                            + c1.gearType + ", door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", gearType = " 
                            + c2.gearType + ", door = " + c2.door);
    }
}