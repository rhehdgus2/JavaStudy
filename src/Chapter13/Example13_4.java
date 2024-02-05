package Chapter13;

import javax.swing.JOptionPane;

public class Example13_4 {
	public static void main(String[] args) {
		// 사용자에게 입력 값을 받아옴
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		// 10부터 1까지 숫자를 역순으로 출력
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);  // 1초간 시간을 지연한다.
			} catch(Exception e) {} // InterruptedException 등 예외 처리
		}
	}
}
