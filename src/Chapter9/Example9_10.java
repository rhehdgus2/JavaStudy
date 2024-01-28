package Chapter9;
public class Example9_10 {
    public static void main(String[] args) {
        // StringBuffer 객체 생성
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        // 객체 참조 비교
        System.out.println("sb == sb2 ? " + (sb == sb2));
        // 내용 비교 (String 클래스처럼 equals 메서드를 사용하지 않음)
        System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));

        // StringBuffer의 내용을 String으로 변환
        String s = sb.toString(); // String s= new String(sb);와 같음
        String s2 = sb2.toString();

        // String 객체의 내용 비교
        System.out.println("s.equals(s2) ? " + s.equals(s2));
    }
}