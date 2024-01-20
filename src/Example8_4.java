public class Example8_4 {
    public static void main(String[] args) {
        System.out.println(1);  // 1을 출력
        System.out.println(2);  // 2를 출력
        try {
            System.out.println(3);  // 3을 출력
            System.out.println(0 / 0);  // 0으로 나누면 ArithmeticException을 발생시킴
            System.out.println(4);  // 실행되지 않음
        } catch (ArithmeticException ae) {  // ArithmeticException을 처리
            if (ae instanceof ArithmeticException)
                System.out.println("true");  // true를 출력
            System.out.println("ArithmeticException");  // ArithmeticException을 출력
        } catch (Exception e) {  // ArithmeticException을 제외한 모든 예외를 처리
            System.out.println("Exception");  // Exception을 출력
        }  // try - catch 블록의 끝
        System.out.println(6);  // 6을 출력
    }  // main 메서드의 끝
}