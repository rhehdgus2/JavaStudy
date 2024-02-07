package Chapter13;

public class Example13_11 {
	// 시작 시간을 나타내는 변수
	static long startTime = 0;
	
	public static void main(String[] args) {
		// ThreadEx11_1 객체 생성
		ThreadEx11_1 th1 = new ThreadEx11_1();
		// ThreadEx11_2 객체 생성
		ThreadEx11_2 th2 = new ThreadEx11_2();
		th1.start();
		th2.start();
		// 현재 시간으로 시작 시간 설정
		startTime = System.currentTimeMillis();
		
		try {
			th1.join();  // main 쓰레드가 th1의 작업이 끝날 때까지 기다린다.
			th2.join();  // main 쓰레드가 th2의 작업이 끝날 때까지 기다린다.
		} catch(InterruptedException e) {}
		
		System.out.print("소요시간 : " + (System.currentTimeMillis() - Example13_11.startTime));
	}  // main
}

class ThreadEx11_1 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			// '-'를 300번 출력
			System.out.print(new String("-"));
		}
	}  // run()
}

class ThreadEx11_2 extends Thread {
	public void run() {
		for(int i = 0; i < 300; i++) {
			// '|'를 300번 출력
			System.out.print(new String("|"));
		}
	}  // run()
}