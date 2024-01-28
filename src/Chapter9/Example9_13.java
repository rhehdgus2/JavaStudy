package Chapter9;
public class Example9_13 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        // 객체 참조 비교
        System.out.println("i == i2 ? " + (i == i2));
        // 값 비교
        System.out.println("i.equals(i2) ? " + i.equals(i2));
        // 두 Integer 객체의 값 비교 (1: 같음, 0: 같음, -1: 다름)
        System.out.println("i.compareTo(i2) = " + i.compareTo(i2));
        // Integer 객체의 문자열 표현
        System.out.println("i.toString() = " + i.toString());

        // Integer 클래스의 상수 출력
        System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
        // Integer 클래스의 비트 크기 출력
        System.out.println("SIZE = " + Integer.SIZE + " bits");
        // Integer 클래스의 바이트 크기 출력
        System.out.println("BYTES = " + Integer.BYTES + " bytes");
        // Integer 클래스의 데이터 타입 출력
        System.out.println("TYPE = " + Integer.TYPE);
    }
}