public class Example9_11 {
    public static void main(String[] args) {
        // StringBuffer 객체 생성
        StringBuffer sb = new StringBuffer("01");
        // sb의 끝에 23을 추가하고, sb2에는 sb의 참조를 전달
        StringBuffer sb2 = sb.append(23);
        // sb의 끝에 '4'와 56을 추가
        sb.append('4').append(56);
        // sb3에는 sb의 참조를 전달하고, sb의 끝에 78과 9.0을 추가
        StringBuffer sb3 = sb.append(78).append(9.0);

        // 결과 출력
        System.out.println("sb = " + sb);
        System.out.println("sb2 = " + sb2);
        System.out.println("sb3 = " + sb3);

        // sb의 10번 인덱스의 문자 삭제
        System.out.println("sb = " + sb.deleteCharAt(10));
        // sb의 3번부터 6번 인덱스 사이의 문자 삭제
        System.out.println("sb = " + sb.delete(3, 6));
        // sb의 3번 인덱스에 "abc"를 삽입
        System.out.println("sb = " + sb.insert(3, "abc"));
        // sb의 6번 인덱스부터 끝까지를 "END"로 대체
        System.out.println("sb = " + sb.replace(6, sb.length(), "END"));

        // StringBuffer의 capacity와 length 출력
        System.out.println("capacity = " + sb.capacity());
        System.out.println("length = " + sb.length());
    }
}