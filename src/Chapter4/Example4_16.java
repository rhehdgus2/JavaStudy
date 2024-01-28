package Chapter4;

public class Example4_16 {
	public static void main(String[] args) {
		int sum = 0;	// 합계를 저장하는 변수 초기화
		int i = 0;		// 반복 횟수를 저장하는 변수 초기화
		
		while(true) {	// 무한 루프 시작
			if(sum > 100) // 합계가 100을 초과하면 루프를 탈출
				break;
			++i;	// 반복 횟수를 1 증가시키고 합계에 더함
			sum += i;
		}
		// 반복이 종료된 후의 반복 횟수와 합계를 출력
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}
}