package Chapter13;

import javax.swing.JOptionPane;

public class Example13_9 {
	public static void main(String[] args) throws Exception {
		// ThreadEx9_1 객체 생성
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();  // 스레드 시작
		
		// 사용자로부터 입력 받음
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");  // 입력값 출력
		// interrupt()를 호출하면 스레드가 중단됨, interrupted 상태가 true가 된다.
		th1.interrupt();
		System.out.println("isInterrupted() : " + th1.isInterrupted());  // true 출력
	}
}

class ThreadEx9_1 extends Thread {
	public void run() {
		int i = 10;
		
		// i가 0이 아니고 스레드가 interrupt되지 않은 동안 반복
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);  // 현재 i 출력 후 1 감소
			for(long x = 0; x < 2500000000L; x++);  // 시간 지연
		}
		// 반복 종료 후 메시지 출력
		System.out.println("카운트가 종료되었습니다.");
	}
}