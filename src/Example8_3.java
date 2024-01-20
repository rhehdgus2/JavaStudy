public class Example8_3 {
    public static void main(String[] args) {
        System.out.println(1);  // 1을 출력
        System.out.println(2);  // 2를 출력

        try {
            System.out.println(3);  // 3을 출력
            System.out.println(0 / 0);  // 0으로 나누면 ArithmeticException이 발생
            System.out.println(4);  // 실행되지 않음
        } catch (Exception e) {  // ArithmeticException 대신 Exception으로 모든 예외를 잡아서 처리
            System.out.println(5);  // 예외가 발생하면 5를 출력
        }  // try-catch 블록의 끝

        System.out.println(6);  // 6을 출력
    }  // main 메서드의 끝
}