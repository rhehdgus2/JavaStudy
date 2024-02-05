package Chapter13;

import javax.swing.JOptionPane;

public class Example13_5 {
	public static void main(String[] args) throws Exception {
		ThreadEx5_1 th1 = new ThreadEx5_1();
		// ThreadEx5_1 스레드 시작
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
	}
}

class ThreadEx5_1 extends Thread {
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);  // 1초 동안 스레드를 중지
			} catch(Exception e) {}  // InterruptedException 등 예외 처리
		}
	}  // run ()
}
