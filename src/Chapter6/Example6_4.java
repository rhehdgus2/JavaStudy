package Chapter6;

public class Example6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();  // MyMath 클래스의 인스턴스를 생성하여 mm 변수에 할당
        long result1 = mm.add(5L, 3L);  // MyMath 클래스의 add 메서드를 호출하고 결과를 result1에 저장
        long result2 = mm.subtract(5L, 3L);  // MyMath 클래스의 subtract 메서드를 호출하고 결과를 result2에 저장
        long result3 = mm.multiply(5L, 3L);  // MyMath 클래스의 multiply 메서드를 호출하고 결과를 result3에 저장
        double result4 = mm.divide(5L, 3L);  // MyMath 클래스의 divide 메서드를 호출하고 결과를 result4에 저장

        // 각 메서드의 결과를 출력
        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
    }
}

class MyMath {
    // 덧셈 메서드: 두 개의 long 형 매개변수를 받아 덧셈을 수행하고 결과를 반환
    long add(long a, long b) {
        long result = a + b;
        return result;
        // return a + b;  // 위의 두 줄을 한 줄로 간단히 할 수 있다.
    }

    // 뺄셈 메서드: 두 개의 long 형 매개변수를 받아 뺄셈을 수행하고 결과를 반환
    long subtract(long a, long b) {
        return a - b;
    }

    // 곱셈 메서드: 두 개의 long 형 매개변수를 받아 곱셈을 수행하고 결과를 반환
    long multiply(long a, long b) {
        return a * b;
    }

    // 나눗셈 메서드: 두 개의 double 형 매개변수를 받아 나눗셈을 수행하고 결과를 반환
    double divide(double a, double b) {
        return a / b;
    }
}