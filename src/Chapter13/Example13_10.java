package Chapter13;

public class Example13_10 {
	public static void main(String[] args) {
		// RunImplEx10 객체 생성
		RunImplEx10 r = new RunImplEx10();
		// 스레드 th1, th2, th3 생성
		Thread th1 = new Thread(r, "*");
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");
		// 스레드 th1, th2, th3 시작
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();       // 스레드 th1을 잠시 중단시킨다.
			Thread.sleep(2000);
			th2.suspend();		 // 스레드 th2를 잠시 중단시킨다.
			Thread.sleep(3000);
			th1.resume();        // 스레드 th1이 다시 동작하도록 한다.
			Thread.sleep(3000);
			th1.stop();          // 스레드 th1을 강제 종료 시킨다.
			th2.stop();			 // 스레드 th2을 강제 종료 시킨다.
			Thread.sleep(2000);
			th3.stop();			 // 스레드 th3을 강제 종료 시킨다.
		} catch (InterruptedException e) {}
	}  // main
}

class RunImplEx10 implements Runnable {
	public void run() {
		while(true) {
			// 현재 스레드의 이름 출력
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);  // 1초 동안 스레드를 중지
			} catch(InterruptedException e) {}
		}
	}  // run()
}