package Chapter11;

import java.util.TreeSet;

public class Example11_15 {
	public static void main(String[] args) {
		// TreeSet을 이용하여 Set 생성
		TreeSet set = new TreeSet();
		
		// 정수 배열 선언 및 초기화
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		// 배열의 각 요소를 TreeSet에 추가
		for(int i = 0; i < score.length; i++)
			set.add(new Integer(score[i]));
		
		// 특정 값 미만 및 이상의 값 출력
		System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50)));
		System.out.println("50보다 큰 값 : " + set.tailSet(new Integer(50)));
	}
}


