class Data3 {
    int x;  // 인스턴스 변수 x를 가진 Data3 클래스 정의
}

public class Example6_7 {
    public static void main(String[] args) {
        Data3 d = new Data3();  // Data3 클래스의 인스턴스 생성 및 변수 d에 할당
        d.x = 10;  // 인스턴스 변수 x에 값 10을 할당

        Data3 d2 = copy(d);  // copy 메서드를 호출하여 d를 복사한 새로운 객체 d2를 생성
        System.out.println("d.x = " + d.x);  // 원본 객체 d의 x 값 출력
        System.out.println("d2.x = " + d2.x);  // 복사된 객체 d2의 x 값 출력
    }

    static Data3 copy(Data3 d) {
        Data3 tmp = new Data3();  // 새로운 객체 tmp를 생성
        tmp.x = d.x;  // 원본 객체 d의 x 값을 tmp 객체의 x에 복사
        return tmp;  // 복사한 객체의 주소를 반환
    }
}