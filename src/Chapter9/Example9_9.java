package Chapter9;
public class Example9_9 {
    public static void main(String[] args) {
        int iVal = 100;
        // int를 String으로 변환
        String strVal = String.valueOf(iVal);

        double dVal = 200.0;
        // int를 String으로 변환하는 또 다른 방법
        String strVal2 = dVal + "";

        // 문자열을 정수로 변환하여 합계 계산
        double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
        // 문자열을 각각 정수와 실수로 변환하여 합계 계산
        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

        // 결과 출력
        System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
        System.out.println(strVal + "+" + strVal2 + "=" + sum2);
    }
}