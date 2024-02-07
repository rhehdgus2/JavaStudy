package Chapter13;

public class Example13_12 {
	public static void main(String[] args) {
		// RunnableEx12 객체 생성
		Runnable r = new RunnableEx12();
		// 새로운 스레드에서 실행, ThreadGroup에 의해 참조되므로 gc대상이 아니다.
		new Thread(r).start();
		new Thread(r).start();
	}
}

class Account {
	// 잔고를 나타내는 변수
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int money) {
		// 출금 가능한 경우
		if(balance >= money) {
			// 1초 동안 일시 정지 (의도적으로 동기화 문제 발생)
			try { Thread.sleep(1000); } catch(InterruptedException e) {}
			balance -= money;  // 출금
		}
	}  // withdraw
}

class RunnableEx12 implements Runnable {
	// 공유 자원인 Account 객체 생성
	Account acc = new Account();
	
	public void run() {
		while(acc.getBalance() > 0) {
			// 100, 200, 300 중의 한 값을 임의로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance());
		}
	}  // run()
}