package Chapter7;

//정적 임포트를 사용한 예제
//java.lang 패키지의 System 클래스와 Math 클래스의 정적 멤버들을 import
import static java.lang.System.out;
import static java.lang.Math.*;

//메인 클래스 정의
public class Example7_5 {
 public static void main(String[] args) {
     // Math.random() 대신 random()을 직접 사용 가능
     out.println(random());

     // Math.PI 대신 PI를 직접 사용 가능
     out.println("Math.PI : " + PI);
 }
}