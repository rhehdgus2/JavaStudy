package Chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example11_18 {
	public static void main(String[] args) {
		// 주어진 문자열 배열
		String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D" };
		
		// HashMap 객체 생성
		HashMap map = new HashMap();
		
		// 배열의 각 문자를 카운트하여 저장
		for(int i = 0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				int value = (int)map.get(data[i]);
				map.put(data[i], value + 1);  // 기존에 있는 키는 기존 값에 1을 더해서 저장
			} else {
				map.put(data[i], 1);  // 기존에 없는 키는 값을 1로 저장
			}
		}
	
		// Iterator를 사용하여 저장된 데이터 출력
		Iterator it = map.entrySet().iterator();	
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = (int)entry.getValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
	}  // main
	
	// 주어진 문자와 횟수에 따라 막대 출력
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i = 0; i < bar.length; i++)
			bar[i] = ch;
		
		return new String(bar);  // String(char[] chArr)
	}
}