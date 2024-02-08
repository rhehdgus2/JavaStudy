package Chapter14;

import java.util.function.Predicate;

public class Example14_3 {
	public static void main(String[] args) {
		// Predicate 정의
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i % 2 == 0;
		Predicate<Integer> notP = p.negate();  // i >= 100
		
		// 여러 Predicate을 조합하여 새로운 Predicate 생성
		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150));  // true
		
		// 문자열 비교를 위한 Predicate 정의
		String str1 = "abc";
		String str2 = "abc";
		
		// str1과 str2가 같은지 비교한 결과를 반환
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		System.out.println(result);  // true
	}
}
