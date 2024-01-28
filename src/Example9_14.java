public class Example9_14 {
	public static void main(String[] args) {
		// 문자열 "100"을 정수로 변환
		int i = new Integer("100").intValue();
		// 문자열 "100"을 정수로 변환 (정적 메서드)
		int i2 = Integer.parseInt("100");
		// 문자열 "100"을 Integer 객체로 변환
		Integer i3 = Integer.valueOf("100");
		
		// 2진수 문자열 "100"을 10진수 정수로 변환
		int i4 = Integer.parseInt("100" ,2);
		// 8진수 문자열 "100"을 10진수 정수로 변환
		int i5 = Integer.parseInt("100" ,8);
		// 16진수 문자열 "100"을 10진수 정수로 변환
		int i6 = Integer.parseInt("100" ,16);
		// 16진수 문자열 "FF"을 10진수 정수로 변환
		int i7 = Integer.parseInt("FF" ,16);
//		int i8 = Integer.parseInt("FF");  // NumberFormatException 발생
		
		// 2진수 문자열 "100"을 10진수 정수로 변환 (valueOf)
		int i9 = Integer.valueOf("100" ,2);
		// 8진수 문자열 "100"을 10진수 정수로 변환 (valueOf)
		int i10 = Integer.valueOf("100" ,8);
		// 16진수 문자열 "100"을 10진수 정수로 변환 (valueOf)
		int i11 = Integer.valueOf("100" ,16);
		// 16진수 문자열 "FF"을 10진수 정수로 변환 (valueOf)
		int i12 = Integer.valueOf("FF" ,16);
//		int i13 = Integer.valueOf("FF");  // NumberFormatException 발생
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println("100(2) -> " + i4);
		System.out.println("100(8) -> " + i5);
		System.out.println("100(16) -> " + i6);
		System.out.println("FF(16) -> " + i7);
		
		System.out.println("100(2) -> " + i9);
		System.out.println("100(8) -> " + i10);
		System.out.println("100(16) -> " + i11);
		System.out.println("FF(16) -> " + i12);
	}
}