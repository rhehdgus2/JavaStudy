package Chapter13;

public class Example13_7 implements Runnable {
	// 자동 저장 여부를 나타내는 변수
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		Thread t = new Thread(new Example13_7());
		// 데몬 스레드로 설정 (프로그램 종료 시 함께 종료, 이 부분이 없으면 종료되지 않음)
		t.setDaemon(true);
		// 스레드 시작
		t.start();
		
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);  // 1초씩 쉬면서 카운트
			} catch(InterruptedException e) {}
			// 현재 카운트 출력
			System.out.println(i);
			
			// 5번째 반복에서 autoSave를 true로 변경
			if(i == 5) autoSave = true;
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		while(true)	 {
			try {
				Thread.sleep(3 * 1000);  // 3초마다 쉬면서 카운트
			} catch(InterruptedException e) {}
			
			// autoSave의 값이 true이면 autoSave()를 호출
			if(autoSave) autoSave();
		}
	}
	
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}
