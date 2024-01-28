package Chapter6;

public class Example6_13 {
    // 정적 변수 arr을 선언하고 초기화하는 클래스 초기화 블럭
    static int[] arr = new int[10];

    static {
        // 배열 arr에 1과 10 사이의 임의의 값을 저장하는 초기화 블럭
        for (int i = 0; i < arr.length; i++) {
            // Math.random()은 0 이상 1 미만의 난수를 반환하므로,
            // 1과 10 사이의 정수로 변환하여 배열에 저장합니다.
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public static void main(String[] args) {
        // 배열 arr의 요소를 출력하는 반복문
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }
}