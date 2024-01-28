package Chapter9;
public class Example9_6 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		
		// 문자열 리터럴로 생성 (리터럴 풀 사용)
		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");
		
		System.out.println("str1 == str2 ? " + (str1 == str2));  // 참조 비교 (주소 비교) → true
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));  // 값 비교 → true
		System.out.println();
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		// new 키워드로 새로운 객체 생성
		System.out.println("String str3 = new String(\"abc\");");  
		System.out.println("String str4 = new String(\"abc\");");

		System.out.println("str3 == str4 ? " + (str3 == str4));  // 참조 비교 (주소 비교) → false
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));  // 값 비교 → true
	}
}