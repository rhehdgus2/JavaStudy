package Chapter13;

public class Example13_1 {
	public static void main(String[] args) {
		// ThreadEx1_1 클래스의 객체 생성
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		// ThreadEx1_2 클래스의 객체 생성 (Runnable을 구현한 클래스)
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);  // 생성자 Thread(Runnable을 인자(target)로 받음)
		
		// start 메서드를 별도의 스레드에서 실행
		t1.start();
		t2.start();
	}
}

class ThreadEx1_1 extends Thread {
	public void run() {
		for(int i = 0; i < 5; i++) {
			// 현재 실행중인 스레드의 이름을 출력
			System.out.println(getName());  // 조상인 Thread의 getName()을 호출
		}
	}
}

class ThreadEx1_2 implements Runnable {
	public void run() {
		for(int i = 0; i < 5; i++) {
			// Thread.currentThread() - 현재 실행중인 Thread를 반환
			System.out.println(Thread.currentThread().getName());
		}
	}
}