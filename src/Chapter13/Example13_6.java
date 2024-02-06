package Chapter13;

public class Example13_6 {
	public static void main(String[] args) {
		ThreadEx6_1 th1 = new ThreadEx6_1();  // ThreadEx6_1 객체 생성
		ThreadEx6_2 th2 = new ThreadEx6_2();  // ThreadEx6_2 객체 생성
		
		// th2 스레드의 우선순위를 7로 설정
		th2.setPriority(7);
		
		// th1, th2 스레드의 우선순위 출력
		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(|) : " + th2.getPriority());
		th1.start();  // th1 스레드 시작
		th2.start();  // th2 스레드 시작
	}
}

class ThreadEx6_1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");  // '-'를 300번 출력
			for(int x = 0; x < 10000000; x++);  // 작은 딜레이를 발생시키는 루프
		}
	}
}

class ThreadEx6_2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("|");  // '|'를 300번 출력
			for(int x = 0; x < 10000000; x++);  // 작은 딜레이를 발생시키는 루프
		}
	}
}