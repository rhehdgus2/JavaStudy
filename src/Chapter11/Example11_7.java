package Chapter11;

import java.util.Arrays;
import java.util.Comparator;

public class Example11_7 {
	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		// 문자열 배열을 Comparable 구현에 의해 정렬
		Arrays.sort(strArr);
		System.out.println("strArr = " + Arrays.toString(strArr));
		// 대소문자 구분 없이 문자열 배열 정렬
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr = " + Arrays.toString(strArr));
		// 사용자 정의 Comparator를 이용한 역순 정렬
		Arrays.sort(strArr, new Descending());
		System.out.println("strArr = " + Arrays.toString(strArr));
	}
}
// 사용자 정의 Comparator 구현
class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			// Comparable을 구현한 객체들끼리 비교하여 역순으로 정렬
			// -1을 곱해서 기본 정렬방식의 역으로 변경한다
			// 또는 c2.compareTo(c1)와 같이 순서를 바꿔도 된다.
			return c1.compareTo(c2) * - 1;
		}
		return - 1;
	}
}