package Chapter13;

public class Example13_8 {
	public static void main(String[] args) {
		// ThreadEx8_1, ThreadEx8_2 객체 생성
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		// th1, th2 스레드 시작
		th1.start(); th2.start();
		
		try {
			th1.sleep(2000);  // main 스레드가 2초 동안 일시 정지
		} catch(InterruptedException e) {}
		
		// main 스레드 종료 메시지 출력
		System.out.print("<<main 종료>>");
	}  // main
}

class ThreadEx8_1 extends Thread {
	public void run() {
		// '-'를 300번 출력
		for(int i = 0; i < 300; i++) System.out.print("-");
		// th1 스레드 종료 메시지 출력
		System.out.print("<<th1 종료>>");
	}  // run()
}

class ThreadEx8_2 extends Thread {
	public void run() {
		// '|'를 300번 출력
		for(int i = 0; i < 300; i++) System.out.print("|");
		// th2 스레드 종료 메시지 출력
		System.out.print("<<th2 종료>>");
	}  // run()
}