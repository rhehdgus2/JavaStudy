package Chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Example11_9 {
	public static void main(String[] args) {
        // 다양한 타입의 요소를 가진 배열 생성
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4","4"};
		// Set 인터페이스를 구현한 HashSet 생성
		Set set = new HashSet();
		
		for(int i = 0; i < objArr.length; i++) {
			// HashSet에 objArr의 요소들을 저장
			set.add(objArr[i]);
		}
		// HashSet에 저장된 요소들을 출력
		System.out.println(set);
		
		// HashSet에 저장된 요소들을 출력(Iterator이용)
		Iterator it = set.iterator();
		
		// Iterator를 통해 순회하면서 요소 출력
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}