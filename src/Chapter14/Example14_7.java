package Chapter14;

import java.util.Arrays;
import java.util.stream.Stream;

public class Example14_7 {
	public static void main(String[] args) {
		// 문자열 배열을 포함한 Stream 생성
		Stream<String[]> strArrStrm = Stream.of(
		   new String[] {"abc", "def", "jkl" },
		   new String[] {"ABC", "GHI", "JKL"}
		);
		
		
//		Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
		// flatMap을 사용하여 각 배열의 요소를 포함한 단일 Stream으로 변환
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		// 각 문자열을 소문자로 변환하고 중복 제거, 정렬 후 출력
		strStrm.map(String::toLowerCase)
			  .distinct()
			  .sorted()
			  .forEach(System.out::println);
		System.out.println();
		
		// 문자열 배열을 이용한 Stream 생성
		String[] lineArr = {
			"Believe or not It is true",
			"Do or do not There is no try",
		};
		
		// 각 문장을 공백을 기준으로 분리하여 flatMap을 통해 단어별 Stream으로 변환
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line -> Stream.of(line.split(" +")))
		   .map(String::toLowerCase)
		   .distinct()
		   .sorted()
		   .forEach(System.out::println);
		System.out.println();
	}
}