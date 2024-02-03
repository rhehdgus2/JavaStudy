package Chapter11;

import java.util.TreeSet;

public class Example11_14 {
	public static void main(String[] args) {
		// TreeSet을 이용하여 Set 생성
		TreeSet set = new TreeSet();
		
		// 범위 검색을 위한 문자열 설정
		String from = "b";
		String to = "d";
		
        // 문자열 요소 추가
		set.add("abc");  set.add("alien");  set.add("bat");
		set.add("car");  set.add("Car");  set.add("disc");
		set.add("dance");  set.add("dZZZZ");  set.add("dzzzz");
		set.add("elephant");  set.add("elevator");  set.add("fan");
		set.add("flower");
		
		// TreeSet 출력
		System.out.println(set);
		// 범위 검색 및 결과 출력
		System.out.println("range search : from " + from + " to " +to);
		System.out.println("result1 : " + set.subSet(from, to));
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
	}
}