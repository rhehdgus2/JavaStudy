package Chapter6;

public class Example6_9 {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        // 다양한 메서드 호출 및 결과 출력
        System.out.println("mm.add(3, 3) 결과 : " + mm.add(3, 3));
        System.out.println("mm.add(3L, 3) 결과 : " + mm.add(3L, 3));
        System.out.println("mm.add(3, 3L) 결과 : " + mm.add(3, 3L));
        System.out.println("mm.add(3L, 3L) 결과 : " + mm.add(3L, 3L));
        
        int[] a = {100, 200, 300};
        System.out.println("mm.add(a) 결과 : " + mm.add(a));
    }
}
class MyMath3 {
    // 정수형 매개변수 두 개를 받아 덧셈을 수행하고 결과를 반환하는 메서드
    int add(int a, int b) {
        System.out.print("int add(int a, int b) - ");
        return a + b;
    }
    // 정수형 매개변수와 long 형 매개변수를 받아 덧셈을 수행하고 결과를 반환하는 메서드
    long add(int a, long b) {
        System.out.print("long add(int a, long b) - ");
        return a + b;
    }
    // long 형 매개변수와 정수형 매개변수를 받아 덧셈을 수행하고 결과를 반환하는 메서드
    long add(long a, int b) {
        System.out.print("long add(long a, int b) - ");
        return a + b;
    }
    // long 형 매개변수 두 개를 받아 덧셈을 수행하고 결과를 반환하는 메서드
    long add(long a, long b) {
        System.out.print("long add(long a, long b) - ");
        return a + b;
    }
    // 배열의 모든 요소의 합을 결과로 돌려주는 메서드
    int add(int[] a) {
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for (int i = 0; i < a.length; i++)
            result += a[i];
        return result;
    }
}