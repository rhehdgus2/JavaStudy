package Chapter14;

import java.io.File;
import java.util.stream.Stream;

public class Example14_6 {
	public static void main(String[] args) {
		// 파일 객체 배열 생성
		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
				new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")};
		
		// 파일 객체 배열로부터 Stream<File> 생성
		Stream<File> fileStream = Stream.of(fileArr);
		
		// map()으로 Stream<File>을 Stream<String>으로 변환
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println);    // 모든 파일의 이름을 출력
		
		fileStream = Stream.of(fileArr);  // 스트림을 다시 생성하여 다양한 연산 수행
		
		// map(), filter(), distinct() 등을 활용한 파일 확장자 처리
		fileStream.map(File::getName)                   // Stream<File> → Stream<String>
			.filter(s -> s.indexOf('.')!= -1)           // 확장자가 없는 것은 제외
			.map(s -> s.substring(s.indexOf('.') + 1))  // 확장자만 추출
			.map(String::toUpperCase)                   // 모두 대문자로 변환
			.distinct()                                 // 중복 제거
			.forEach(System.out::print);                // JAVABAKTXT
		
		System.out.println();
	}
}