package Chapter13;

public class Example13_3 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		// ThreadEx3_1 클래스의 객체 생성
		ThreadEx3_1 th1 = new ThreadEx3_1();
		// 스레드 시작
		th1.start();
		// 현재 시간을 startTime에 저장
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 300; i++)
			// 300번 반복하여 "-"를 출력
			System.out.printf("%s", new String("-"));
		
		// 첫 번째 루프 소요시간 출력
		System.out.print("소요시간1 : " + (System.currentTimeMillis() - Example13_3.startTime));
	}
}
// Thread 클래스를 상속받아서 새로운 클래스 ThreadEx3_1을 정의
class ThreadEx3_1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++)
			// 300번 반복하여 "|"를 출력
			System.out.printf("%s", new String("|"));
		
		// 두 번째 루프 소요시간 출력
		System.out.print("소요시간2 : " + (System.currentTimeMillis() - Example13_3.startTime));
	}
}