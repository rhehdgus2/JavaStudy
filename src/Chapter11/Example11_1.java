package Chapter11;

import java.util.ArrayList;
import java.util.Collections;

public class Example11_1 {
	public static void main(String[] args) {
		// ArrayList 객체 생성 및 초기화
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		// list1의 일부를 사용하여 list2 생성
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		// list1과 list2 출력
		print(list1, list2);
		
		Collections.sort(list1);  // list1과 list2를 정렬
		Collections.sort(list2);  // Collections.sort(List l)
		print(list1, list2);
		// list1이 list2를 모두 포함하는지 확인
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		// list2에 요소 추가
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");  // 인덱스가 3인 곳에 "A"를 추가
		print(list1, list2);
		
		list2.set(3, "AA");  // 인덱스가 3인 곳은 "AA"로 변경
		print(list1, list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체들을 삭제
		for(int i = list2.size() - 1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	}  // main의 끝
	
	// ArrayList를 출력하는 메서드
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}  // class