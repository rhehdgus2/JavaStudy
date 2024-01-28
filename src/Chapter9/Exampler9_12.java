package Chapter9;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Exampler9_12 {
    public static void main(String[] args) {
        double val = 90.7552;
        // round 메서드를 사용하여 반올림한 결과 출력
        out.println("round(" + val + ") = " + round(val));

        val *= 100;
        // round 메서드를 사용하여 반올림한 결과 출력 (곱셈 후)
        out.println("round(" + val + ") = " + round(val));

        // round 메서드를 사용하여 반올림한 결과와 100으로 나눈 결과 출력
        out.println("round(" + val + ") / 100 = " + round(val) / 100);
        // round 메서드를 사용하여 반올림한 결과와 100.0으로 나눈 결과 출력
        out.println("round(" + val + ") / 100.0 = " + round(val) / 100.0);
        out.println();

        // printf를 사용하여 ceil, floor, round, rint의 결과 출력
        out.printf("ceil(%3.1f) = %3.1f%n", 1.1, ceil(1.1));
        out.printf("floor(%3.1f) = %3.1f%n", 1.5, floor(1.5));
        out.printf("round(%3.1f) = %d%n", 1.1, round(1.1));
        out.printf("round(%3.1f) = %d%n", 1.5, round(1.5));
        out.printf("rint(%3.1f) = %f%n", 1.5, rint(1.5));
        out.printf("round(%3.1f) = %d%n", -1.5, round(-1.5));
        out.printf("rint(%3.1f) = %f%n", -1.5, rint(-1.5));
        out.printf("ceil(%3.1f) = %f%n", -1.5, ceil(-1.5));
        out.printf("floor(%3.1f) = %f%n", -1.5, floor(-1.5));
    }
}