public class Example4_17 {
	public static void main(String[] args) {
		// 0부터 10까지의 숫자에 대한 반복문 시작
		for(int i = 0; i <= 10; i++) {
			// i가 3으로 나누어 떨어지면 continue를 통해 반복문의 나머지 부분을 건너뛰고 다음 반복문 이동
			if(i%3 == 0)
				continue;
			// 3으로 나누어 떨어지지 않는 경우에만 해당 숫자를 입력
			System.out.println(i);
		}
	}
}