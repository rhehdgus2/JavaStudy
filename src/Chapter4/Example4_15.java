package Chapter4;

import java.util.Scanner;

public class Example4_15 {
	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;	// 1 ~ 100 사이의 임의의 수를 저장
		Scanner sc = new Scanner(System.in);		// 사용자로부터 입력을 받기 위한 Scanner 객체 생성
		
		do {
			System.out.println("1과 100사이의 정수를 입력하세요.>");
			input = sc.nextInt();	// 사용자로부터 정수 입력 받음
			
			if(input > answer) {	// 입력한 수와 정답을 비교하여 힌트를 출력
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while(input!=answer);
		
		System.out.println("정답입니다.");		// 정답을 맞추면 반복문을 빠져나와 정답 메시지 출력
	}
}