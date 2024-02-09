package Chapter14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example14_9 {
	public static void main(String[] args) {
		// 문자열 배열
		String[] strArr = {
		   "Inheritance", "Java", "Lambda", "stream",
		   "OptionalDouble", "IntStream", "count", "sum"
		};
		
		// 문자열 배열을 출력
		Stream.of(strArr).forEach(System.out::println);
		
		// 문자열 배열에 빈 문자열이 없는지 확인
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0);
		
		// 문자열 배열에서 첫 번째 글자가 's'인 문자열 찾기
		Optional<String> sWord = Stream.of(strArr)
								.filter(s -> s.charAt(0) == 's').findFirst();
		
		System.out.println("noEmptyStr = " + noEmptyStr);
		System.out.println("sWord = " + sWord.get());
		
		// Stream<String>을 IntStream으로 변환
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		// 각각의 IntStream에 대해 reduce를 사용하여 연산 수행
		int count = intStream1.reduce(0, (a,b) -> a + 1);
		int sum = intStream2.reduce(0, (a,b) -> a + b);
		
		OptionalInt max = intStream3.reduce(Integer::max);
		OptionalInt min = intStream4.reduce(Integer::min);
		System.out.println("count = " + count);
		System.out.println("sum = " + sum);
		System.out.println("max = " + max.getAsInt());
		System.out.println("min = " + min.getAsInt());
	}
}