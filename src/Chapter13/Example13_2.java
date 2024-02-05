package Chapter13;

public class Example13_2 {
	public static void main(String[] args) {
		// 현재 시간을 밀리초 단위로 기록
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 300; i++)
			// 300번 반복하여 "-"를 출력
			System.out.printf("%s", new String("-"));
		
		// 첫 번째 루프 소요시간 출력
		System.out.print("소요시간1 : " + (System.currentTimeMillis() - startTime));
		
		for(int i = 0; i < 300; i++)
			// 300번 반복하여 "|"를 출력
			System.out.printf("%s", new String("|"));
		
		// 두 번째 루프 소요시간 출력
		System.out.print("소요시간2 : " + (System.currentTimeMillis() - startTime));
	}
}
