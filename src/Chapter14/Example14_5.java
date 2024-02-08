package Chapter14;

import java.util.Comparator;
import java.util.stream.Stream;

public class Example14_5 {
	public static void main(String[] args) {
		// 학생 정보를 담고 있는 Stream 생성
		Stream<Student> studentStream = Stream.of(
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200),
				new Student("안자바", 2, 100),
				new Student("박자바", 2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("감자바", 3, 180)
				);
		
		// 반별로 정렬 후, 동일한 반일 경우 총점 내림차순으로 정렬하여 출력
		studentStream.sorted(Comparator.comparing(Student::getBan)  // 반별 정렬
				.thenComparing(Comparator.naturalOrder()))          // 기본 정렬
				.forEach(System.out::println);
	}
}

class Student implements Comparable<Student> {
	String name;
	int ban;
	int totalScore;
	
	// 생성자를 통해 학생 정보 초기화
	Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	// 객체를 문자열로 표현하는 메서드
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore);
	}
	
	String getName() { return name; }  // 학생 이름 반환
	int getBan() { return ban; }  // 학생 반 반환
	int getTotalScore() { return totalScore; }  // 학생 총점 반환
	
	// 총점 내림차순을 기본 정렬로 한다.
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}
}