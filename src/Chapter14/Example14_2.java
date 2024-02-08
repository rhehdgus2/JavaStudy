package Chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example14_2 {
	public static void main(String[] args) {
		// Supplier: 랜덤한 정수를 생성하는 람다식
		Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1;
		// Consumer: 정수를 출력하는 람다식
		Consumer<Integer> c = i -> System.out.print(i+", ");
		// Predicate: 짝수 여부를 확인하는 람다식
		Predicate<Integer> p = i -> i % 2 == 0;
		// Function: i의 일의 자리를 없애는 람다식
		Function<Integer, Integer> f = i -> i / 10 * 10;
		
		// Integer 타입의 리스트 생성
		List<Integer> list = new ArrayList<>();
		// 랜덤한 정수를 리스트에 추가하는 메서드 호출
		makeRandomList(s, list);
		System.out.println(list);
		
		// 짝수를 출력하는 메서드 호출
		printEvenNum(p, c, list);
		
		// 일의 자리를 없앤 새로운 리스트 생성하는 메서드 호출
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
	}
	
	// Function을 이용해 리스트의 각 요소에 변환 작업을 수행하는 메서드
	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		// 변환된 요소를 담을 새로운 리스트 생성
		List<T> newList = new ArrayList<T>(list.size());
		// 기존 리스트의 각 요소에 변환 작업을 수행하고 새로운 리스트에 추가
		for(T i : list) {
			newList.add(f.apply(i));
		}

		return newList;  // 변환된 리스트 반환
	}
	
	// Predicate와 Consumer를 이용해 리스트에서 조건에 맞는 요소를 출력하는 메서드
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");  // 출력 형식 시작
		for(T i : list) {  // 조건에 맞는 요소를 Consumer를 이용해 출력
			if(p.test(i))
				c.accept(i);
		}
		System.out.println("]");  // 출력 형식 종료
	}
	
	// Supplier를 이용해 랜덤한 값을 리스트에 추가하는 메서드
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		// 랜덤한 값을 생성하고 리스트에 추가
		for(int i = 0; i < 10; i++) {
			list.add(s.get());
		}
	}
}
