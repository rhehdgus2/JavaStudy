package Chapter11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Example11_10 {
	public static void main(String[] args) {
		// Set을 이용해 중복 없이 1부터 45 사이의 난수 6개 생성
		Set set = new HashSet();
		
		// 중복 없이 6개의 난수를 생성하여 Set에 추가
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(new Integer(num));
		}
		
		// Set을 LinkedList로 변환하여 정렬
		List list = new LinkedList(set);
		Collections.sort(list);
		
		// 정렬된 리스트 출력
		System.out.println(list);
	}
}