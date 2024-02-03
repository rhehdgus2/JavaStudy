package Chapter11;

import java.util.Set;
import java.util.TreeSet;

public class Example11_13 {
	public static void main(String[] args) {
		// TreeSet을 이용하여 Set 생성
		Set set = new TreeSet();
		
		// 1부터 45까지의 난수를 생성하여 Set에 추가
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(num);  // set.add(new Integer(num)); - 옛날 방식
		}
		System.out.println(set);
	}
}


