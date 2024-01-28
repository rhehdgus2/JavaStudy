package Chapter9;
public class Example9_3 {
    public static void main(String[] args) {
        // 두 개의 동일한 문자열을 가지는 String 객체 생성
        String str1 = new String("abc");
        String str2 = new String("abc");

        // equals 메서드를 통한 두 문자열의 동등성 비교
        System.out.println(str1.equals(str2));

        // hashCode 메서드를 통한 각 문자열의 해시 코드 출력
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        // System.identityHashCode 메서드를 통한 객체의 식별용 해시 코드 출력
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}