package Chapter14;

import java.util.Optional;
import java.util.OptionalInt;

public class Example14_8 {
	public static void main(String[] args) {
		// 문자열 "abcde"로 Optional 객체 생성
		Optional<String> optStr = Optional.of("abcde");
		
		// map을 사용하여 문자열 길이를 구하여 Optional 객체 생성
		Optional<Integer> optInt = optStr.map(String::length);
		
		// 각 Optional 객체의 값을 출력
		System.out.println("optStr = " + optStr.get());
		System.out.println("optInt = " + optInt.get());
		
		// 문자열 "123"을 정수로 변환하여 결과를 출력
		int result1 = Optional.of("123")
						.filter(x -> x.length() >0)
						.map(Integer::parseInt).get();
		
		// 빈 문자열을 정수로 변환하되 값이 없을 경우 기본값 -1로 설정
		int result2 = Optional.of("")
						.filter(x -> x.length() >0)
						.map(Integer::parseInt).orElse(-1);
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		// 문자열 "456"을 정수로 변환하여 결과를 출력 (ifPresent 사용)
		Optional.of("456").map(Integer::parseInt)
					   .ifPresent(x -> System.out.printf("result3 - %d%n", x));
		
		// OptionalInt 객체 생성
		OptionalInt optInt1 = OptionalInt.of(0);    // 0을 저장
		OptionalInt optInt2 = OptionalInt.empty();  // 빈 객체를 생성
		
		// 각 OptionalInt 객체의 상태 출력
		System.out.println(optInt1.isPresent());    // true
		System.out.println(optInt2.isPresent());    // false
		
		// 각 OptionalInt 객체의 값 출력
		System.out.println(optInt1.getAsInt());     // 0
//		System.out.println(optInt2.getAsInt());     // NoSuchElementException
		
		// 각 OptionalInt 객체의 문자열 표현 출력
		System.out.println("optInt1 = " + optInt1);
		System.out.println("optInt2 = " + optInt2);
		
		// 두 OptionalInt 객체의 동등성 비교
		System.out.println("optInt1.equals(optInt2)?" + optInt1.equals(optInt2));	
	}
}