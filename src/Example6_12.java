public class Example6_12 {
    // 클래스 초기화 블럭
    static {
        System.out.println("static { }"); // 클래스가 처음 로딩될 때 한 번 실행
    }
    
    // 인스턴스 초기화 블럭
    {
        System.out.println("{ }"); // 객체가 생성될 때마다 실행
    }

    // 생성자
    public Example6_12() {
        System.out.println("생성자"); // 객체가 생성될 때 호출
    }

    public static void main(String[] args) {
        System.out.println("Example6_12 bt = new Example6_12(); ");
        Example6_12 bt = new Example6_12(); // 객체 생성

        System.out.println("Example6_12 bt2 = new Example6_12(); ");
        Example6_12 bt2 = new Example6_12(); // 또 다른 객체 생성
    }
}