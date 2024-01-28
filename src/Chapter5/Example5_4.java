package Chapter5;

import java.util.Arrays;

public class Example5_4 {
	public static void main(String[] args) {
		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};  // 초기 정수 배열 선언 및 초기화
		System.out.println(Arrays.toString(numArr));  // 배열의 현재 상태 출력
		
		for(int i = 0; i < 100; i++) {
			int n = (int)(Math.random() * 10);  // 0 ~ 9 중의 한 값을 임의로 얻는다. 3을 얻어다고 가정하자.
			// numArr[0]과 numArr[n]의 값을 서로 바꾼다.
			int tmp = numArr[0];  // numArr[0]의 값을 변수 tmp에 저장
			numArr[0] = numArr[n];  // numArr[3]의 값을 numArr[0]에 저장
			numArr[n] = tmp;  // tmp의 값을 numArr[3]에 저장
		}
		System.out.println(Arrays.toString(numArr));  // 배열의 현재 상태 출력
	}  // main의 끝
}