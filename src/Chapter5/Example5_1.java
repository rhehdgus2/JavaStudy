package Chapter5;

import java.util.Arrays;

public class Example5_1 {
	public static void main(String[] args) {
		int[] iArr1 = new int[10];	// 길이가 10인 정수형 배열 생성
		int[] iArr2 = new int[10];	// 길이가 10인 정수형 배열 생성
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60};	// 길이가 5이고 초기값이 주어진 배열 생성
		int[] iArr3 = {100, 95, 80, 70, 60};	// 길이가 5이고 초기값이 주어진 배열 생성
		char[] chArr = {'a', 'b', 'c', 'd'};	// 길이가 4이고 초기값이 주어진 문자형 배열 생성
		
		for(int i = 0; i < iArr1.length; i++) {
			iArr1[i] = i + 1;	// 1 ~ 10의 숫자를 순서대로 배열에 넣는다.
		}
		
		for(int i = 0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random() * 10) + 1;	// 1 ~ 10의 값을 배열에 저장
		}
		
		// 배열에 저장된 값들을 출력
		for(int i = 0; i < iArr1.length; i++) {
			System.out.println(iArr1[i] + ", ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2));	 // 배열의 값을 문자열로 출력
		System.out.println(Arrays.toString(iArr2));	 // 배열의 값을 문자열로 출력
		System.out.println(Arrays.toString(iArr2));  // 배열의 값을 문자열로 출력
		System.out.println(iArr3);	// 배열의 참조값 출력, 실행할 때마다 달라질 수 있다.
		System.out.println(chArr);
	}
}